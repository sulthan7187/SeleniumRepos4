package javaprog;

public class OccuranceString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Automation";
		int a = s.length();
		System.out.println(a);
		String s1 = s.replaceAll("t", "");
		String s2 = s1.replaceAll("A", "");
		System.out.println(s2);
		System.out.println(s1);
		int b = s1.length();
		int c = s2.length();
	
		int d = a-c;
		int v = a-b;
		

		//System.out.println("Occurance of A = " + d);
		System.out.println("Occurance of t = " + v);
	}

}
