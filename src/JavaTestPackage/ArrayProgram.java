package JavaTestPackage;

public class ArrayProgram {

	public static void main(String[] args) {
		
		
		int i[]= new int [10];
		
		i[0] = 100;
		i[1] = 200;
		i[2] = 300;
		i[3] = 400;
		i[4] = 500;
		i[5] = 600;
		i[6] = 700;
		i[7] = 800;
		i[8] = 900;
		i[9] = 1000;
		
		System.out.println(i[9]);
		System.out.println(i[5]);
		System.out.println(i.length);
		
		for(int j=0;j<i.length;j++)
		{
			System.out.println(i[j]);
		}
		

	}

}
