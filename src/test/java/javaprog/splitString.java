package javaprog;

public class splitString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcd-1234";
		int d = s.length();
       String[] a = s.split("-");
       char[] m = s.toCharArray();
        String b = a[0];
        String c = a[1];
        
        
       System.out.print(c);
       System.out.print(" ");
       System.out.print(b);
	}

}
