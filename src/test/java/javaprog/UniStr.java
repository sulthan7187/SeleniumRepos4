package javaprog;

import java.util.HashSet;
import java.util.Set;

public class UniStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Automation";
		String b = s.toLowerCase();
		int a = b.length();
		System.out.println(b);

        Set<Character> uniqueChars = new HashSet<>();
        Set<Character> repeatedChars = new HashSet<>();

        for (int i = 0; i < a; i++) {
            char currentChar = b.charAt(i);
            if (!repeatedChars.contains(currentChar)) {
                if (!uniqueChars.add(currentChar)) {
                    // If the character is already in uniqueChars, it's not unique
                    uniqueChars.remove(currentChar);
                    repeatedChars.add(currentChar);
                }
            }
        }

        System.out.println("Duplicate characters: " + repeatedChars);
        System.out.println("Unique characters: " + uniqueChars);
    }
}