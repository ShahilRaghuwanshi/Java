package Methods;

public class StringSearch {

	Boolean search(String s, char c){
		/*
		char[] ch = s.toCharArray();
		for(int i = 0; i < s.length(); i++) {
			if(ch[i] == c) {
				return true;
			}
		}
		return false;
		*/
		
		/*
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == c) {
				return true;
			}
		}
		return false;
		*/ 
		
		/*
		if(s.indexOf(c) >= 0) {
			return true;
		}
		return false;
		*/
		
		if(s.contains(String.valueOf(c))){
			return true;
		}
		return false;
	}
}
