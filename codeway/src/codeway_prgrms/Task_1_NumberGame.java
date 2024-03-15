package codeway_prgrms;
import java.util.Random;
import java.util.Scanner;
public class Task_1_NumberGame 
{
	int maxRange=100;
	int chance;
	int score=0;
	int rNumber;
	int gNum;
	int won=0;
	//method for number of attempts for user
	public void attempts()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter limit attempts");
		chance=s.nextInt();
		System.out.println("you have "+ chance+" attempts to win this game");
	}
	//method for to generate random number
	public void randomNumber()
	{
		Random r= new Random();
		rNumber = r.nextInt(maxRange);
		System.out.println("Random generated number is:"+rNumber);
	}
	//method for to enter guess number
	public void guessNumber()
	{
		Scanner s= new Scanner(System.in);
		System.out.println("enter guess number");
		gNum=s.nextInt();
		System.out.println("user's guess number is :"+ gNum);
	}
	//method for compare both random number and guess number
	public void comparison()
	{
		System.out.println("---feedback is---");
		if(gNum==rNumber)
		{
			System.out.println("Wow..! your guess is obsulately correct");
			won++;
		}
		else if(gNum>rNumber)
		{
			System.out.println("oops..! your guess is too high");
		}
		else if(gNum<rNumber)
		{
			System.out.println("oops..! your guess is too low");
		}
	}
	public void playAgain()
	{
		Scanner s= new Scanner(System.in);
		int attempt=1;
		if(attempt<chance)
		{
			for(int i=1;i<chance;i++)
			{
				System.out.println("Do you want play again.?");
			    //System.out.println("enter your answer");
				String again=s.next();
					if(again.equalsIgnoreCase("yes"))
					{
						guessNumber();
						randomNumber();
						comparison();
						attempt++;
					}
					 else
				    {
					    break;
				    }
		   }
		}
		System.out.println("Do you want play again?");
		String again=s.next();
		if(again.equalsIgnoreCase("yes"))
		{
			System.out.println(" sorry your attempts are completed");
		}
		else
		{
		}
		System.out.println("You will attempt "+attempt+ " times");
	}
	public static void main(String[] args) 
	{
		System.out.println("WELECOME TO THE NUMBERS GAME");
		Task_1_NumberGame t1= new Task_1_NumberGame();
		t1.attempts();
		t1.guessNumber(); 
		t1.randomNumber();
		t1.comparison();
		t1.playAgain();
		System.out.println("You won the game "+t1.won+" times");
		int score=t1.won;
		System.out.println("your score is:"+score);
	}
}
