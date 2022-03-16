import java.util.Scanner;

public class Even {
	public static void main(String[]args)
	{
		int num;
		try (Scanner num1 = new Scanner(System.in)) {
			System.out.println("Enter Number");
			num=num1.nextInt();
		}
		for(int i=0;i<=num;i++)
		{
		if(i%2==0)
		{
			
			System.out.println(+i);
		}
		
	}

}
}