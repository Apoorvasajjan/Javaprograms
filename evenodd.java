package demo;
import java.util.Scanner;
public class evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner input=new Scanner(System.in);
     System.out.println("enter a number:");
     int num=input.nextInt();
     String evenOdd=(num%2==0)?"even":"odd";
     System.out.println(num +" is "+ evenOdd);
	}

}
