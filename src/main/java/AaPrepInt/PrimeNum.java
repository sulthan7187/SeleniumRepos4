package AaPrepInt;

public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 12;
		int count = 0;
		//int a = num/2;
		if(num>1) {
		for(int i =1;i<=100;i++) {
			if(num%i==0) 
				count++;
		}
		if(count==2) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Not Prime");
		}

	}
		else {
			System.out.println("Not Prime");
		}
	}
}
