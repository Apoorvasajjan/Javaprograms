package demo;
public class Sub{
	
public static void main(String[] args) {
	
}
class SubClass{
	int student_count=41;
	static char grade='A';
	{
		String sub="Edubridge Learning Pvt Ltd - Java Full Stack";
		String trainer="Jayanth Vellingiri";
		
	}
	static{
		System.out.println("Its a static block");
	}
	public void userMethod(){
		int age=100;
		System.out.println("This is a User Def Method");
		
		class MethodInsideClass{
			public void methodLocalClass(){
				System.out.println("Method Local Inner class method");
			}
		}
	}
	SubClass(){
		System.out.println("Def Constructor");
	}
	
	SubClass(int salary){
		System.out.println("Para Constructor :" + salary);
	}
	
	class SubToSubClass{
		
		public String methodType(){
			return "userDefMethod";
		}
		
	}
	
}
	
}