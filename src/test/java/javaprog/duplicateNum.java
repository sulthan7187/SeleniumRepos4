package javaprog;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class duplicateNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr =  {1,2,3,3,5,6,7,7};
		int a = arr.length;
		for(int i=0;i<a;i++) {
			for(int j=i+1;j<a;j++) {
				if(arr[i]==arr[j]) {
					System.out.print(arr[j]);
					 //Integer.parseInt(null);
				}
			}
		}
		
		

	}

}
