package InterviewProg;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TwoNumDupUni {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	List<Integer> list1 = Arrays.asList(1,2,3,4,5);
	List<Integer> list2 = Arrays.asList(3,4,5,6,7);
	
	Set<Integer> uniq = new HashSet<>(list1);
	
	uniq.addAll(list2);
	
	Set<Integer> inte = new HashSet<>(list1);
	inte.retainAll(list2);
	uniq.removeAll(inte);
	System.out.println("Unique " + uniq);
	System.out.println("Duplicates " + inte);
	
	
	

	}

}
