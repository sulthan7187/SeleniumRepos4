package javaprog;

import java.util.HashSet;
import java.util.Set;

public class UniNum {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 3, 5, 6, 7, 7};
        int n = arr.length;

        Set<Integer> set = new HashSet<>();
        Set<Integer> uniqueNumbers = new HashSet<>();


        for (int i = 0; i < n; i++) {
            int currentNumber = arr[i];
           // System.out.print(currentNumber);
            if (!uniqueNumbers.contains(currentNumber)) {
            	if(!set.add(currentNumber)) {
                uniqueNumbers.add(currentNumber);
            	set.remove(currentNumber);
            	}
            } /*else {
                // If the number is already in the set, remove it from uniqueNumbers
                uniqueNumbers.remove(currentNumber);
            }*/
           // set.add(currentNumber);
        }
        System.out.println("Duplicate numbers: " + uniqueNumbers);
        System.out.println("Unique numbers: " + set);
    
}
}