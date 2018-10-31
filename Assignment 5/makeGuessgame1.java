/*Assignment:
Write a method called MakeGuesses……
Method signature: public static void makeGuesses() 
As usual,  call your method from main() to test it.
Added a Max_Guess
The Java.lang.math.max() function is an inbuilt function in Java which returns maximum of two numbers. The arguments are taken in int, double, float and long.If a negative and a positive number is passed as argument then the positive result is generated.
*/
package makeGuessgame;
import java.util.Random;
import java.util.*;

public class makeGuessgame1 {
	public static final int Max_Guess = 50;

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		int answer = r.nextInt(Max_Guess);
		int guess;
		int numGuesses = 0;

		System.out.println("Welcome to King Solomon's number guessing game: Enter your guess");
		System.out.println();

		do {
			System.out.print("Your Guess?");
			guess = keyboard.nextInt();
			numGuesses++;

			if (guess < answer) {
				System.out.println("higher");
			} else if (guess > answer) {
				System.out.println("lower");
			}
		} while (guess != answer);

		System.out.println("You got it right in"+ numGuesses+ "" +"guesses");
		System.out.println();

	}

}
