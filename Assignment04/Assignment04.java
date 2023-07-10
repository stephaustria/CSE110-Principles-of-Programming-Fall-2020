// CSE 110: Class 76370 / Tuesday 12-12:50
// Assignment : Assignment 4
// Author : Stephen Austria 1220159551
// Description : Mastermind Game

import java.util.Scanner;
import java.util.Random;

public class Assignment04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Random number = new Random();
		
		System.out.println("----- MASTERMIND -----");
		
		//loop that chooses the secret number
		while (true) {
			int secretNumber = number.nextInt(9999);
			System.out.println("Guess the 4 digit number!");
			int guessNumber = 1;
		
		//loop where the user guesses until number is found
		while (true) {
			System.out.print("\nGuess " + guessNumber + ": ");
			int guess = scan.nextInt();
			int numberMatch = numberMatchCnt(secretNumber, guess);
			System.out.println("You matched " + numberMatch);
		
		//tells user what number he found
			if (numberMatch == 4) {
				System.out.println("\nCongratulations! You guessed the right number in " + guessNumber + " guesses.");
				scan.nextLine();
				break;
			}
			guessNumber++;
			
		}
		
		//ask user if they want to play again or not
		System.out.println("Would you like to play again (yes/no)?");
		String answer = scan.nextLine();
		
		if (answer.compareToIgnoreCase("no") == 0) {
			break;
		}
			
		
	
		
			
		}

	}
	
	//checking the match count
	private static int numberMatchCnt(int secretNumber, int guess) {
		int cnt = 0;
		// TODO Auto-generated method stub
		if (String.valueOf(secretNumber).length() == String.valueOf(guess).length()) {
			String value_1 = String.valueOf(secretNumber);
			String value_2 = String.valueOf(guess);
			
			for (int i = 0; i < value_1.length(); i++) {
				if (value_1.charAt(i) == value_2.charAt(i)) {
					cnt++;
				}
			}
		}
		return cnt;
	}

}
