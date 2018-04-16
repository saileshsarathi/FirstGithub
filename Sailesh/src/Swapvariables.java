
public class Swapvariables implements TestInterface {
	
	
	
	
	public static int c = 200;
	public int d = 500;
	
	int i = 2;
	int j = 3;
	
	public static void sai(int a , int b){
		
     int 	temp= a;
		a= b;
		b=temp;
		
		System.out.println(a);
		System.out.println(b);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Swapvariables sw = new Swapvariables();
		Swapvariables.c=200;
		System.out.println(c);
		sai(100, 200);
		
		TestInterface z = new Swapvariables();
		//System.out.println(TestInterface.name);
		
		z.jai();
		
	
	}


	@Override
	public void jai() {
		System.out.println("Hello fuck u");
		
	}

}
