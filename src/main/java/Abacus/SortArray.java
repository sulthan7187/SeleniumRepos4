package Abacus;

import java.util.Arrays;
import java.util.List;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {10,7,8,4,1};
		int a = arr.length;
		
		 Arrays.sort(arr);
		 
		 System.out.println(Arrays.toString(arr));
		
		for(int i =0; i<a; i++) {
			for(int j = i+1; j<a;j++) {
				int p = 0;
				if(arr[j]< arr[i]) {
					p = arr[i];
					arr[i]=arr[j];
					arr[j]=p;
				}
			}
			System.out.print(arr[i]+ " ");
		}

	}

}
