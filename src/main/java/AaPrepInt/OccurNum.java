package AaPrepInt;

public class OccurNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Automation";
		String f = s1.toLowerCase();
		int d = f.length();
		int a = s1.length();
		
		String s2 = f.replaceAll("a", "");
		int b = s2.length();
		int c = a-b;
		System.out.println(c);

	}

}
