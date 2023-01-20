package demo;
 
public class Wrapper{
	
Integer integer=new Integer(100);
		//int num=100
		//latest 
		Integer integer1=Integer.valueOf(100);//boxing
			byte byte1=integer1.byteValue();//deboxing
		System.out.println(byte1);	
		
		Integer integer2=200;//autoboxing
		int num2=integer2;//auto-de-boxing
		
		Integer intFirst=Integer.valueOf(200);
		Integer intSecond=Integer.valueOf(500);
		
		System.out.println(intFirst+intSecond);
		
		double dvalue=integer2.doubleValue();
			Integer strInteger=Integer.getInteger("anand");
			System.out.println(strInteger);
			
			boolean b=Boolean.parseBoolean("HELLO");
			System.out.println(b);
			
			//parseXXX(String)
			//parseInt("100")//100
			//parseDouble("234");//234.00
			//parseFloat()
			//