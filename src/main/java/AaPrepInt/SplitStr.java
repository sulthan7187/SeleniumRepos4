package AaPrepInt;

public class SplitStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Abcd1234";
		
		String s1 = s.replaceAll("[0-9]", "");
		String s2 = s.replaceAll("[^0-9]", "");
		
		System.out.println(s1);
		System.out.println(s2);

	}

}
