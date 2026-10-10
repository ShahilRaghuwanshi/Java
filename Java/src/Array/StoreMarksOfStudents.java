package Array;

import java.util.Scanner;

public class StoreMarksOfStudents {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int[] arr = new int[5];
		
		System.out.println("Enter the marks of student 0");
		arr[0] = sc.nextInt();
		
		System.out.println("Enter the marks of student 1");
		arr[1] = sc.nextInt();
		
		System.out.println("Enter the marks of student 2");
		arr[2] = sc.nextInt();
		
		System.out.println("Enter the marks of student 3");
		arr[3] = sc.nextInt();
		
		System.out.println("Enter the marks of student 4");
		arr[4] = sc.nextInt();
		
		System.out.println("Array contents are ---> ");
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
	}
}
