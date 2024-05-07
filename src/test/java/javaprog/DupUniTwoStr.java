package javaprog;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DupUniTwoStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Abababbdabq";
        String s2 = "abbdopsdjq";

        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();

        // Add characters of s1 to set1
        for (char c : s1.toCharArray()) {
            set1.add(c);
        }

        // Add characters of s2 to set2
        for (char c : s2.toCharArray()) {
            set2.add(c);
        }

        // Find intersection of set1 and set2
        set1.retainAll(set2);

        System.out.println("Duplicates: " + set1);

        // Find unique characters
        Set<Character> uniqueChars = new HashSet<>(set1);
        uniqueChars.addAll(set2);

        // Remove characters common to both sets (i.e., duplicates)
        uniqueChars.removeAll(set1);

        System.out.println("Unique characters: " + uniqueChars);
    }
}