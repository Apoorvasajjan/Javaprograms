package demo;
import java.util.Scanner;

public class Leap {

	public static void main(String[] args) {
    int year;
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter the year");
    year = obj.nextInt();
    if(year%4==0)
    {
    	System.out.println("year is leap");
    }
    else
    {
    	System.out.println("year is not leap");
    	obj.close();
    }
	}

}
