package AaPrepInt;

import java.util.HashSet;
import java.util.Set;

public class DupStringUni {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Automation";
		String s2 = s.toLowerCase();
		int a = s2.length();
		
		Set<Character> uniq = new HashSet<>();
		Set<Character> dup = new HashSet<>();
		
		for(int i=0; i<a; i++) {
			char c = s2.charAt(i);
		if(!dup.contains(c)) {
			if(!uniq.add(c)) {
				dup.add(c);
				uniq.remove(c);
			}
		}
			
		}
		System.out.println(uniq);
		System.out.println(dup);

	}

}
