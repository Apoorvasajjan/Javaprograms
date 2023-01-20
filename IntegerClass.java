package demo;
import java.util.*;
public class IntegerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //static int bitcount
        int num=47;
        int num1=80;
		Integer integer=Integer.valueOf(num);
		Integer integer1=Integer.valueOf(num1);
		byte byte1=integer.byteValue();
		System.out.println(byte1);
		
		Float float1=integer.floatValue();
		System.out.println("float value"+float1);
		System.out.println(Math.max(integer, integer1));
		System.out.println(Math.min(integer, integer1));
		
		long long1=integer.longValue();
		System.out.println("long value:"+long1);
		
		double double1=integer.doubleValue();
		System.out.println("double value:"+double1);
		
		String string1=integer.toString();
		System.out.println("string value"+string1);
		
		Integer reverse1=Integer.reverse(num);
		System.out.println(reverse1);
		
		Integer reverse2=Integer.reverseBytes(num);
		System.out.println(reverse2);
		
		boolean check=integer.equals(integer1);
		System.out.println(check);
		
		Integer check1=Integer.compare(integer1,integer);
		System.out.println(check1);
		
		Integer check2=Integer.highestOneBit(integer1);
		System.out.println(check2);
		
		Integer check3=Integer.lowestOneBit(integer1);
		System.out.println(check3);
		
	}

}
