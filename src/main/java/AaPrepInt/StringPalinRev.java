package AaPrepInt;

public class StringPalinRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Automation";
		String rev = "";
		int a = s.length();
		for(int i = (a-1);i>=0;i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);
		if(rev.toLowerCase().equals(s.toLowerCase())) {
			System.out.println("Str Palin");
		}
		else {
			System.out.println("Str not Palin");
		}

	}

}
