package AaPrepInt;

import java.util.HashSet;
import java.util.Set;

public class DupUniNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {1,2,3,4,3,2};
		int b = a.length;
		
		Set<Integer> uniq = new HashSet<>();
		Set<Integer> dup = new HashSet<>();
		
		for(int i =0;i<b;i++) {
			int c = a[i];
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
