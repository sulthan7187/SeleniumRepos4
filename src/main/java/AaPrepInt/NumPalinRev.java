package AaPrepInt;

public class NumPalinRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1000990001;
		int rem ;
		int sum = 0;
		int temp;
		temp = a;
		while(a>0) {
			rem = a%10;
			sum = rem+ sum*10;
			a = a/10;
		}
		System.out.println("Reverse " + sum);
		if(temp==sum) {
			System.out.println("Number is Palindrome");
		}
		else {
			System.out.println("Not a palindrome");
		}
	}

}
