package javaprog;

import java.util.List;

import org.testng.internal.junit.ArrayAsserts;

public class DupStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ahdshgdfdhgf";
		int a = s.length();
		char[] c = s.toCharArray();
		int count = 0;
		for(int i = 0; i <a; i++) {
			for(int j = i+1; j<a;j++) {
				if(c[i]==c[j]) {
					count++;
					System.out.print(c[j]);
				}
			}
			
		}
		
		

	}

}
