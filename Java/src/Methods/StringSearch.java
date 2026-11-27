package Methods;

public class StringSearch {

	Boolean search(String s, char c){
		char[] ch = s.toCharArray();
		for(int i = 0; i < s.length(); i++) {
			if(ch[i] == c) {
				return true;
			}
		}
		return false;
	}
}
