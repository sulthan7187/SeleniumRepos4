package InterviewProg;

import java.util.HashSet;
import java.util.Set;

public class DupString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Abcddcef";
		int a = str.length();
		Set<Character> uniq = new HashSet<>();
		Set<Character> dup = new HashSet<>();
		
		
		for(int i=0; i<a; i++) {
			char c = str.charAt(i);
			if(!dup.contains(c)) {
				if(!uniq.add(c)) {
					dup.add(c);
					uniq.remove(c);
					
				}	
				}
			}
		System.out.println("Duplicates " +dup);
		System.out.println("Unique " +uniq);
		}

	}


