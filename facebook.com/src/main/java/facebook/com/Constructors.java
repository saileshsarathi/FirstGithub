package facebook.com;

import java.util.ArrayList;

import net.sourceforge.htmlunit.corejs.javascript.ast.ForLoop;

public class Constructors {
String sai;
String sarathi;


Constructors(String name, String age){
	this.sai = name;
	this.sarathi = age;
	System.out.println(this.sai);
	System.out.println(this.sarathi);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Constructors c = new Constructors("hello", "twenty");
		
	
	
	ArrayList<String> hello = new ArrayList<String>();
	hello.add("add");
	hello.add("sub");
	System.out.println(hello);
	String[] fruits = new String[] { "Orange", "Apple", "Pear", "Strawberry" };

	for (String fruit : fruits) {
	    // fruit is an element of the `fruits` array.
		System.out.println(fruit);
	}
	
	
		
	}
	}


