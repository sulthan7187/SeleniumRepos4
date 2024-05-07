package InterviewProg;

public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 10;
		int count =0 ;
		for(int i =1; i<num/2; i++) {
			if(num%i==0) {
			count++;
			}
		}
		if(count==2) {
			System.out.println("Not Prime");
		}
		else {
			System.out.println("Prime");
		}

	}

}
