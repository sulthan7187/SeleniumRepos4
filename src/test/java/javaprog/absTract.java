package javaprog;

public class  absTract {
	public static void main(String[] args) {
		fun o1 = new fun();
		o1.display();
		fun o2 = new fun(25,25,25);
		o2.display();
	}
}
	class fun{
		public int a,b,c;
		 fun(){
			a = 10;
			b=20;
			c=30;
			c=c+a+b;
		}
	  fun(int x,int y,int z){
		 a=x;
		 b=y;
		 c=z;
		 c=a+b+c;
		
	 }
	 public void display() {
		 System.out.println("Total " + c );
	 }
}

