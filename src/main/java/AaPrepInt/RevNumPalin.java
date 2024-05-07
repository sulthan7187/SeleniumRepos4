package AaPrepInt;

public class RevNumPalin {

	public static void main(String[] args) {
		// TODO Auto-generated method stubt
		int n = 10023;
		int sum = 0;
		int rem ;
		int temp;
		temp =n;
		while(n>0) {
			rem = n%10;
			sum = rem + sum*10;
			n=n/10;
		}
		System.out.println("Rev" + sum);
		if(temp == sum) {
			System.out.println("Plaindrome");
		}
		else {
			System.out.println("Not a Plain");
		}

		
	}

}
