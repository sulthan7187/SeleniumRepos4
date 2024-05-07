package InterviewProg;

public class PaliRevnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1200219;
		int sum = 0;
		int temp;
		int rem;
		temp = n;
		while(n>0) {
			rem = n%10;
			sum = rem + sum*10;
			n=n/10;
		}
		System.out.println(sum); // rev the num
       if(sum==temp) {
    	   System.out.println("Number is palindrome");
       }
       else {
    	   System.out.println("Not a Palindrome");
       }
	}

}
