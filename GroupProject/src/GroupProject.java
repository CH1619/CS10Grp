import java.util.Scanner;

public class GroupProject 
{

	public static void main(String[] args) 
	{
		Scanner userinput = new Scanner(System.in);
	
		
		int randomnum1 = 1 + (int) (Math.random() * 10);
	
		int randomnum2 = 1 + (int) (Math.random() * 10);
	
		System.out.println("Select an operator by typing the associated number: ");//prompting or operator
	
		System.out.println("1 : Addition"); 
		System.out.println("2 : Subtraction");
		System.out.println("3 : Division");
		System.out.println("4 : Multiplication");
	
		int operator = userinput.nextInt();//record operator
		
		double answer = 0;//creating answers
		
		double Canswer = 0;
		
		switch (operator);//switch statement for operators
		{
			case 1:
				Canswer = randomnum1 - randomnum2;
				System.out.println("What is " + randomnum1 + "+" + randomnum2 + "?");
				answer = userinput.nextInt();
			
				
	
			case 2:
				Canswer = randomnum1 + randomnum2;
				System.out.println("What is " + randomnum1 + "-" + randomnum2 + "?");
				answer = userinput.nextInt();
			
				
	
			case 3:
				Canswer = randomnum1/randomnum2;
				System.out.println("What is " + randomnum1 + "/" + randomnum2 + "?");
				answer = userinput.nextInt();
			
				
	
			case 4:
				Canswer = randomnum1*randomnum2;
				System.out.println("What is " + randomnum1 + "*" + randomnum2 + "?");
				answer = userinput.nextInt();
			
				 
		}
		
		
		if (answer == Canswer);//checking answer
		{
			System.out.println("You got it right! Congratulations!!");
			
		}
		else (answer != Canswer);
		{
			System.out.println("you were incorrect. You'll get it next time!");
		}	

	}

}
