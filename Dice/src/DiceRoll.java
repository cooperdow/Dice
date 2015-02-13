import java.util.Scanner;
public class DiceRoll {
public static void main(String[] args) {
Scanner userInput = new Scanner(System.in);

int dice1=(int)(Math.random()*20)+1;

	switch(dice1)
	{
	case 2:
	case 4:
	case 5:
	case 6:
	case 10:
	case 12:
	case 14:
	case 18:
	case 20:
		{
		System.out.println("The number is " + dice1);
		System.out.println("You win");
		break;
		}
	case 1:
	case 3:
	case 7:
	case 9:
	case 11:
	case 13:
	case 15:
	case 17:
	case 19:
		{
		System.out.println("The number is " + dice1);
		System.out.println("You tied");
		break;
		}
	default:
		{
		System.out.println("The number is " + dice1);
		System.out.println("You lose");
		}
		
		}
	}
}
		