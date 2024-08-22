import java.util.Scanner;
	public class IT24100370Lab4Q3
{
	public static void main(String[]args)
	{
	
	Scanner input = new Scanner(System.in);
	double number;
	String output;
	
	
	System.out.println("Enter a number: ");
	number = input.nextDouble();
	output = (number > 0) ? "The number is:Positive": (number < 0)? "The number is:Negative" : "The number is : Zero";

		
		 
	
		System.out.println("The number is: " + output);
		
	}
}	