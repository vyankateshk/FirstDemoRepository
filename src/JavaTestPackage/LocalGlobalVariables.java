package JavaTestPackage;

public class LocalGlobalVariables {
	
	String Name = "Global Variable";
	int x = 100;
	
	
	public static void main(String[] args) {
		
		
		int y = 200;
		
		System.out.println(y);
		
		LocalGlobalVariables obj = new LocalGlobalVariables();
		
		System.out.println(obj.x);
		
		int sum = 0;
		
		sum = obj.x + y;
		
		System.out.println("Sum = " +sum);
		
	}
	
	public void sum()
	
	{
		int a= 1000; 
		int b= 2000;
		
		int addition = a+b;
		System.out.println("addition = " +addition);
		
		
	}

}
