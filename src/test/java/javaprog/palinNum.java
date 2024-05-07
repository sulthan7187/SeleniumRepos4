package javaprog;


public class palinNum {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				int x = 101011;
				int rem;
				int sum = 0;
				int temp;
				temp = x;
				while(x>0) {
					rem = x%10;
					sum = sum*10+rem;
					x = x/10;
				}
		       if(temp!=sum) {
		    	   System.out.println(temp+" is a not palindrome " + sum);
		       }
		       else {
		    	   System.out.println(temp+" is a palindrome " + sum);
		    	   
		       }
			}

		}
