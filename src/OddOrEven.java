import java.util.Scanner;

public class OddOrEven {
	public void Findoddoreven()
	{
		Scanner scobj= new Scanner (System.in);
		 
		System.out.println("Enter a number");
		int number= scobj.nextInt();
		
		int Modules = number%2;
		if (Modules == 0)
		{
			System.out.println( number + " is an even number");
		}
		else
		{
			System.out.println( number + " is an odd number");
		}
	}

}
