package class0709302021;

import java.util.Scanner;

public class ClassCExercisesBlock01 {

	public void executeExercise01() {
		// Exercise 01 - 03 words capturer & printer
		Scanner userInsertion = new Scanner(System.in);

		System.out.println("===== Exercise 01 - Word capturer & printer =====");

		System.out.println("Insert the word 01 = ");
		String userWordA = userInsertion.next();
		
		System.out.println("Insert the word 02 = ");
		String userWordB = userInsertion.next();
		
		System.out.println("Insert the word 03 = ");
		String userWordC = userInsertion.next();
		
		System.out.println("=== Inserted words ===");
		System.out.println(userWordA + " " + userWordB + " " + userWordC);
	}
	
	public void executeExercise02() {
		Scanner userData = new Scanner(System.in);
		System.out.println("=== Exercise 02 - Average calculator ===");
		
		System.out.println("Type the average 01 = ");
		float average01 = userData.nextFloat();
		
		System.out.println("Now, insert the average 02 = ");
		float average02 = userData.nextFloat();
		
		System.out.println("To finish, enter the average 03 ");
		float average03 = userData.nextFloat();
		
		float finalAverage = (average01 + average02 + average03)/3;
		
		if(finalAverage >= 7) {
			System.out.println("Congratulations! The student was approved!!!");
		}else if(finalAverage >=5 && finalAverage <=7) {
			System.out.println("Almost there! The student needs some reinforcement classes.");
		}else {
			System.out.println("Sorry. The student was disapproved.");
		}
		
		System.out.println("Final average = " + finalAverage);
	}
	
	public void executeExercise03() {
		Scanner userNumber = new Scanner(System.in);
		
		System.out.println("=== Exercise 03 - User written down ===");
		
		System.out.println("Enter the desired number between 1 and 5 = ");
		int insertedValue = userNumber.nextInt();
		
		switch(insertedValue) {
		case 1:
			System.out.println("Chosen number = ONE");
			break;
		case 2: 
			System.out.println("Chosen number = TWO");
			break;
		case 3:
			System.out.println("Chosen number = THREE");
			break;
		case 4:
			System.out.println("Chosen number = FOUR");
			break;
		case 5:
			System.out.println("Chosen number = FIVE");
			break;
		default:
			System.out.println("Error! Unknown number. Please, try again.");
		}
	}
	
	public void executeExercise04() {
		Scanner userWord = new Scanner(System.in);
		
		System.out.println("=== Exercise 04 - Word printer with repetition loops");
		int wordCounter = 1;
		
		System.out.println("Insert your desired word to be repeated = ");
		String userInput = userWord.next();
		
		// Name printer - "While" loop method
		while(wordCounter <= 10) {
			System.out.println("While loop value = " + wordCounter);
			System.out.println("Typed word (While loop) = " + userInput);
			wordCounter++;
		}
		
		// Name printer - "Do-while" loop method
		wordCounter = 1;
		do {
			System.out.println("Do-while loop value = " + wordCounter);
			System.out.println("Typed word (Do-while loop) = " + userInput);
			wordCounter++;
		}while(wordCounter <= 8);
		
		// Name printer - "For" loop method
		for(wordCounter = 1; wordCounter <= 6; wordCounter++) {
			System.out.println("For loop value = " + wordCounter);
			System.out.println("Typed word (For loop) = " + userInput);
		}
	}
}
