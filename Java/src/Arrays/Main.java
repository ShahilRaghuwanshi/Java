package Arrays;





import java.util.*;

public class Main {

    static int best = 0;
    static int limit;
    static int[] weight;
    static int[] size;
    static long[] conflict;
    static boolean[] invalid;

    static int[] constrained;
    static int[] freeSkills;

    static void dfs(int index, long selectedMask,
                    int totalSkill, int count) {

        if (index == constrained.length) {

            int remaining = limit - totalSkill;
            int totalCount = count;

            // Add the cheapest independent players.
            for (int skill : freeSkills) {
                if (skill <= remaining) {
                    remaining -= skill;
                    totalCount++;
                } else {
                    break;
                }
            }

            best = Math.max(best, totalCount);
            return;
        }

        int id = constrained[index];

        // Option 1: Do not select this group.
        dfs(index + 1, selectedMask, totalSkill, count);

        // Option 2: Select this group.
        if (!invalid[id]
                && totalSkill + weight[id] <= limit
                && (conflict[id] & selectedMask) == 0) {

            dfs(index + 1,
                selectedMask | (1L << id),
                totalSkill + weight[id],
                count + size[id]);
        }
    }

    static int[] parent;

    static int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }

    static void union(int a, int b) {
        int pa = find(a);
        int pb = find(b);

        if (pa != pb) {
            parent[pb] = pa;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] names = new String[n];
        int[] skills = new int[n];

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
            map.put(names[i], i);
        }

        for (int i = 0; i < n; i++) {
            skills[i] = sc.nextInt();
        }

        parent = new int[n];

        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }

        int n1 = sc.nextInt();

        int[][] friends = new int[n1][2];

        for (int i = 0; i < n1; i++) {
            int a = map.get(sc.next());
            int b = map.get(sc.next());

            friends[i][0] = a;
            friends[i][1] = b;

            union(a, b);
        }

        int n2 = sc.nextInt();

        int[][] rivals = new int[n2][2];

        for (int i = 0; i < n2; i++) {
            rivals[i][0] = map.get(sc.next());
            rivals[i][1] = map.get(sc.next());
        }

        limit = sc.nextInt();

        // Create groups using the friend relationships.
        Map<Integer, Integer> componentMap = new HashMap<>();

        int[] component = new int[n];
        int components = 0;

        for (int i = 0; i < n; i++) {

            int root = find(i);

            if (!componentMap.containsKey(root)) {
                componentMap.put(root, components++);
            }

            component[i] = componentMap.get(root);
        }

        weight = new int[components];
        size = new int[components];
        conflict = new long[components];
        invalid = new boolean[components];

        boolean[] isConstrained = new boolean[components];

        // Calculate group sizes and total skills.
        for (int i = 0; i < n; i++) {
            int id = component[i];

            weight[id] += skills[i];
            size[id]++;
        }

        // Friend groups must be selected together.
        for (int[] pair : friends) {
            isConstrained[component[pair[0]]] = true;
        }

        // Process rival relationships.
        for (int[] pair : rivals) {

            int a = component[pair[0]];
            int b = component[pair[1]];

            isConstrained[a] = true;
            isConstrained[b] = true;

            // Both rivals belong to the same friend group.
            if (a == b) {
                invalid[a] = true;
            } else {
                conflict[a] |= (1L << b);
                conflict[b] |= (1L << a);
            }
        }

        // Separate constrained groups and independent players.
        List<Integer> constrainedList = new ArrayList<>();
        List<Integer> freeList = new ArrayList<>();

        for (int i = 0; i < components; i++) {

            if (isConstrained[i]) {
                constrainedList.add(i);
            } else {
                freeList.add(weight[i]);
            }
        }

        constrained = new int[constrainedList.size()];

        for (int i = 0; i < constrained.length; i++) {
            constrained[i] = constrainedList.get(i);
        }

        freeSkills = new int[freeList.size()];

        for (int i = 0; i < freeSkills.length; i++) {
            freeSkills[i] = freeList.get(i);
        }

        // Cheapest independent players are considered first.
        Arrays.sort(freeSkills);

        // Explore all valid constrained-group combinations.
        dfs(0, 0L, 0, 0);

        System.out.println(best);

        sc.close();
    }
}
