package InterviewProg;

import java.util.HashSet;
import java.util.Set;

public class DupNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {1,2,3,4,5,6,6,5,4};
		int a = num.length;
		Set<Integer> uniq = new HashSet<>();
		Set<Integer> dup = new HashSet<>();
		
		for(int i =0; i<a; i++) {
			int cnum = num[i];
			if(!dup.contains(cnum)) {
				if(!uniq.add(cnum)) {
					dup.add(cnum);
					uniq.remove(cnum);
					
				}
			}
		}
System.out.println("Duplicate " +dup);
System.out.println("Unique" +uniq);
	}

}
