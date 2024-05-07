package javaprog;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 193893;
		int sum = 0;
		while(a>0) {
			sum += a%10;
			a=a/10;
			System.out.println(a);
		}
		System.out.println("Sum of digits " + sum);

	}

}
