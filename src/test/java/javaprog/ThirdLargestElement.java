package javaprog;

import java.util.Arrays;

public class ThirdLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,10,20,30,50,12};
		int temp, size;
		size = a.length;
		//System.out.println("Second largest element " + a[size-2]);
		for(int i =0; i<size; i++) {
			for(int j = i+1; j<size; j++) {
				if(a[i]>a[j]) {
					temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(" Smallest element " + a[size-6]);

	}

}
