package javaprog;

public class SplitNumfromStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcd1234";
		String a = "Capgemini";
		a.toCharArray();
		System.out.println(a.charAt(5));
		//String s1 = s.replaceAll("[0-9]", "");
		String s2 = s.replaceAll("[^0-9]", "");
		String s4 = s.replaceAll("[0-9]", "");
		String s5 = a.replaceAll("Capge", "");
		String s6 = a.replaceAll("mini", "");
		String s7 = s5.toUpperCase();
		int s3 = s2.length();
		//String s3 = s.replace("a", " ");
       System.out.println(s2);
       System.out.println(s4);
       System.out.println(s7 + s6);
		//int f = Integer.parseInt(s2);
       // System.out.println(f+10);
	}

}
