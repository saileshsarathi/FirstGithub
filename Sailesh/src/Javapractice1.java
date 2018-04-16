import net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForAbstractMethod;


public class Javapractice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Javapractice a = new Javapractice();

int i = 3;
int k=1;

do {
	System.out.println(i+"  Hello");
	i++;
} while (i<=4);

for(int j =0;i<10;i++){
	System.out.println(i);
	

}

while(k<=10){
	k=k+1;
	System.out.println(k+" even numbers");
	k++;
	
}

int p = 2;
int q= 3;
System.out.println(p++);
System.out.println(p++);
System.out.println(p);
System.out.println(p++);
System.out.println(p);

System.out.println(++q);
System.out.println(++q);
System.out.println(q);
System.out.println(++q);
System.out.println(q);

// 1 D array
 int[]  salary;
 salary = new int[20];
 salary[2] =20;
 
 String[] salary1  = {"a", "b"};
System.out.println(salary1[1]); ;

 
 
 System.out.println(salary[2]);
 
 // 2d array
 int rows = 2;
 int clms = 3;
 int table[][] = new int[rows][clms];
 
 table[0][0] = 20;
 table[0][1] = 30;
 table[1][0] = 40;
 table[1][1] = 50;
 
 System.out.println(table.length);
 System.out.println(table[0].length);
 
 //switch case
 
 int month =1;
 String sailesh = null;
 switch (month){
 
 case 1:
	 sailesh = "Jan";
	 break;
	 
 case 2:
	 sailesh = "Feb"; 
	 break;
	 
 case 3: 
	 sailesh ="Mar";
	 break;

 }

 System.out.println(sailesh);
 System.out.println(month);
 	
	}
	
	
		
}
