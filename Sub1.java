package demo;

public class Sub1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Sub2 s=new Sub2();
   s.thursday();
   }
}
class Sub2{
	public void thursday(){
		System.out.println("Iam a normal user def method");
		class Sub3{
			public void friday(){
				System.out.println("Iam a method local inner class method");
			}
		}
		 Sub3 s=new Sub3();
		   s.friday();
	}
}
