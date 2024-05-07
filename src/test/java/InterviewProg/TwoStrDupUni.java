package InterviewProg;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TwoStrDupUni {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s1 = {"Abcdef"};
		String[] s2 = {"Efgh"};
		
		int a = s1.length;
		int b = s2.length;
		
		Set<Character> uniq = new HashSet<>();
		Set<Character> dup = new HashSet<>();
	
		
		for(int i = 0; i<a; i++) {
			String s = s1.toString();
			char c = s.charAt(i);
			if(!dup.contains(c)) {
				if(!uniq.add(c)) {
					
				}
				
			}
		}
		 
		
		List<Integer> list1 = Arrays.asList(a);
		List<Integer> list2 = Arrays.asList(b);
		
		Set<Integer> uniq1 = new HashSet<>(list1);
		
		uniq1.addAll(list2);
		
		Set<Integer> inte = new HashSet<>(list1);
		inte.retainAll(list2);
		uniq1.removeAll(inte);
		System.out.println("Unique " + uniq1);
		System.out.println("Duplicates " + inte);

	}

}
