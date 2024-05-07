package AaPrepInt;

public class StrRevPalin {

	public static void main(String[] args) {
		// TODO Auto-generated method stubS
		String s = "Automation";
		String rev = "";
		int a = s.length();
		for(int i = (a-1);i>=0;i--) {
			rev = rev+s.charAt(i);
		}
			System.out.println(rev);
			if(rev.toLowerCase().equals(s.toLowerCase())) {
				System.out.println("Palin");
			}
			else {
				System.out.println("Not a palin");
			}
		}

	}

