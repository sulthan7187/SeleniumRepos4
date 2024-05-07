package javaprog;

public class palinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String r = "Virat Kohli", rev ="";
		
		int len = r.length();
		for (int i = (len-1); i >= 0; i --) {
			rev = rev + r.charAt(i);
		}
		if(rev.toLowerCase().equals(r.toLowerCase())) {
			System.out.println(r + " is a Palindrome");
		}
		else {
			System.out.println(r + " is not a Palindrome");
		}
		System.out.println(rev);

	}

}
