
public class Javapractice {
	

 int i=10;
static int k=12;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
int z = 2;
Javapractice j = new Javapractice();

Javapractice j1 = new Javapractice();

//Javapractice j1 = j;
//System.out.println(j1);*/

j.i++;
j1.i++;
j.k++;
j1.k++;

float num = (float)(Math.random()*20);
System.out.println(num);

if (num >10) {
	System.out.println(num+"  number is greater than 10");

}
else if (num< 10) {
	System.out.println(num+"  number is less than 10");
}

int month = 1;
switch(month){

case 1:
	System.out.println("num1");
	break;
case 2:
	System.out.println("num2");
case 3:
	System.out.println("num3");


}

while(z>0 && z<13){
	
	System.out.println(z+ "Hello world");
	z++;
}
/*System.out.println(k);
System.out.println(j1.i);
System.out.println(j.i);*/


System.out.println(j.i++);
System.out.println(j1.i++);
/*System.out.println(j.k++);
System.out.println(j1.k++);*/
System.out.println(k);
System.out.println(j1.k++);
 // Java is high level , platform independant programming language
// JDK comprises java compiler and JRE ( JVM and libs)
//when you compile the code first , it gets converted into .class files 
// Class is nothing but which describes the state/behaviour of the object 
//Object is nothing but the instance of the class that is copy/clone of that particular class
//Every object will be stored in java heap 
//every class will be created with reference variable and new key word
// Class which dont have reference variables are eligible for Garbage collection

//type cast - which is used to change the data type
// class variables are declared with the keyword static
//local variables are created inside the method
//instance variables/global variables are declared in the class
 
	}

}
