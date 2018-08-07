package seleniumProject;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.ie.InternetExplorerDriver;

interface a1{
	String type="interface";
}
class b1 implements a1{
	String type="implemented";
}

public class Class1 {

	public static void main(String[] args) {
		b1 obj=new b1();
		System.out.println(obj.type);
		System.out.println(a1.type);
		
String a="one"+1+2+"two"+5; //just concatenates, wont add
		 
int sum = 10+ +11- -12+ +13;
		// \u000d System.out.println(a);//unicode for new line
System.out.println(sum);

 class consts{
	public static final String name="nested"; //cannot be only static in non static nested class
}
System.out.println(consts.name);

Integer i1=127;
Integer i2=127;
System.out.println(i1==i2);
Integer i3=128;
Integer i4=128; //value above 128 it points to different memory
System.out.println(i3==i4);
System.out.println(Math.min(Integer.MIN_VALUE,0.0d)); //integers min value is negative
Long withL= 100*60*60*24*360L;
Long withoutL=(long) (100*60*60*24*360); //calculates to int
System.out.println(withL);
System.out.println(withoutL);
// static blocks are executed when static classes load

	}

	//	System.setProperty("webdriver.ie.driver", "C:\\Users\\babs1\\eclipse-workspace\\selenium\\IEDriverServer.exe");
	//	WebDriver driver=new InternetExplorerDriver();
//driver.get("www.google.com");
	
	
	//class can have more than one main method ,with different num/type parameters
	//only main method with single String[] (or) String... as param will be considered as entry point for the program.
public static void main(String[][] args) {
		System.out.println("second main");
		//
	}
}
