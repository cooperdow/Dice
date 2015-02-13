import java.util.Scanner;
public class MagicEightBall 
{
public static void main(String[] args) 
{
Scanner userInput = new Scanner(System.in);
	{
	System.out.println("What is your question?");
	String name = userInput.nextLine();
	}

int dice1=(int)(Math.random()*8)+1;

	switch(dice1)
		{
		case 1:
			{
			System.out.println("Follow your dreams");
			break;
			}
		case 2:
			{
			System.out.println("Yes");
			break;
			}
		case 3:
			{
			System.out.println("Maybe if you try hard enough");
			break;
			}
		case 4:
			{
			System.out.println("Sky's the limit");
			break;
			}
		case 5:
			{
			System.out.println("Ask Mr.Eman");
			break;
			}
		case 6:
			{
			System.out.println("I think you already know");
			break;
			}
		case 7:
			{
			System.out.println("No");
			break;
			}
		case 8:
			{
			System.out.println("I can't answer that");
			}
	
		}
	}
}
