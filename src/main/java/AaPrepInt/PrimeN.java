package AaPrepInt;

public class PrimeN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 11;
		int count = 0;
		if(n>0) {
		for(int i =1; i<100;i++) {
			if(n%i==0) 
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
