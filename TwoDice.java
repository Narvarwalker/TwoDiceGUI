// Chapter 4 Game Zone (227)

public class TwoDice
{
	public static void main (String[] args)
	{
		// variables and constants
		Die die1 = new Die();
		Die die2 = new Die();
		Die die3 = new Die();

		// output phase
		System.out.println();
		System.out.println("The first die is: " + die1.getDieValue());
		System.out.println("The second die is: " + die2.getDieValue());
		System.out.println("The third die is: " + die3.getDieValue());
	}
}