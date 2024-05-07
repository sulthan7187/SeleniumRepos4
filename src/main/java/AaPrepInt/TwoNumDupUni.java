package AaPrepInt;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TwoNumDupUni {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list1 = Arrays.asList(1,2,3,4,5);
		List<Integer> list2 = Arrays.asList(4,5,6,7,8);
		
		Set<Integer> uniq = new HashSet<Integer>(list1);
		uniq.addAll(list2);
		
		Set<Integer> dup = new HashSet<Integer>(list1);
		dup.retainAll(list2);
		uniq.removeAll(dup);
		System.out.println(uniq);
		System.out.println(dup);
		
		

	}

}
