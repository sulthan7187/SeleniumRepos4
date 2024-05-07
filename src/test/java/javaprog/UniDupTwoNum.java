package javaprog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniDupTwoNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*List<Integer> list1 = Arrays.asList(1,2,3,4,5,6);
	    List<Integer> list2 = Arrays.asList(1,2,3,7,8,9);
	    // Prepare a union
	    Set<Integer> union = new HashSet<Integer>(list1);
	    union.addAll(list2); //single string
	    // Prepare an intersection
	    Set<Integer> intersection = new HashSet<Integer>(list1);
	    intersection.retainAll(list2);
	    // Subtract the intersection from the union
	    //union.removeAll(intersection);
	    union.retainAll(intersection);
	    	
	    // Print the result  
	       System.out.println(union);*/
		List<Integer> list1 = Arrays.asList(1,2,3,5,4,6);
		List<Integer> list2 = Arrays.asList(1,7,8,9,2,3,4);
		Set<Integer> union = new HashSet<Integer>(list1);
		union.addAll(list2);
		System.out.println(union);
		Set<Integer> intersect = new HashSet<Integer>(list1);
		intersect.retainAll(list2);
		//union.retainAll(intersect);
		union.removeAll(intersect);
		System.out.println("Unique Numbers " +union);
		
		union.addAll(intersect);
		System.out.println(union);
		Set<Integer> intersect1 = new HashSet<Integer>(list1);
		intersect1.retainAll(list2);
		union.retainAll(intersect1);
		System.out.println("Duplicate Numbers " +union);
				
		
		
	    	}

}
