import java. util. Scanner;

public class IT24100370Lab4Q2
{
	public static void main(String[]args)
	{
	double exammarks,submarks,exampmarks,subpmarks,finalmark;
	 exampmarks = 0;
	 subpmarks = 0;
	Scanner input = new Scanner(System.in);
	System.out.println("Please enter exam marks (out of 100): ");
	exammarks = input.nextDouble();
	if(exammarks < 0 || exammarks > 100)
	{
		System.out.println("Invalid input for exam marks. Terminating program.");
		return;
	}
	
	System.out.println("Please enter lab submission (out of 100): ");
	submarks = input.nextDouble();
	if(submarks < 0 || submarks > 100)
	{
		System.out.println("Invalid input for lab submission marks. Terminating program.");
		return;
	}
	
	System.out.println("Please enter the percentage given for the exam: ");
	exampmarks = input.nextDouble();
	
		
	System.out.println("Please enter the percentage given for the lab submission: ");
	subpmarks = input.nextDouble();
	
	if(exampmarks + subpmarks != 100)
	{
		System.out.println("The percentages must add up to 100. Terminating program.");
		return;
	}
	
	finalmark = (exammarks * exampmarks/100) + (submarks * subpmarks/100 );
	System.out.println("Final exam mark is:  " +finalmark );
	
	}
}
