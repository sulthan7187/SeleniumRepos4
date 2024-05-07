package javaprog;

public class revNum {
	public static void main(String[] args) {
		int x = 1001002;
		int rem;
		int temp;
		int sum = 0;
		temp = x;
		while(x>0) {
			rem = x%10;
			sum = sum*10 + rem;
			x=x/10;
		}
		System.out.println(sum);
		
	}

}
