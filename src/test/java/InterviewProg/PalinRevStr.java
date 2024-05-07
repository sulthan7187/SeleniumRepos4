package InterviewProg;

public class PalinRevStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Level";
		String str1 = "";
	   int a = str.length();
	   for(int i = (a-1); i>=0; --i) {
		   str1 = str1+ str.charAt(i);
	   }
    System.out.println(str1);
    if(str1.toLowerCase().equals(str.toLowerCase())) {
    	System.out.println("Palindrome");
    }
    else {
    	System.out.println("Not Palindrome");
    }
	}

}
