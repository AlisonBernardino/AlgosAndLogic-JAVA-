package class0709302021;

public class ClassBAddingRemovingAndLoops {

	// Step A - The difference between 02 increment operators
	public void incrementValues() {

		int numericValue = 10;
		System.out.println("Numeric value = " + numericValue);

		// A1 - Post increment operation
		int postIncrementedValue = numericValue++;
		System.out.println("Numeric value++ = " + postIncrementedValue);

		// A2 - Pre increment operation
		numericValue--;
		int preIncrementedValue = ++numericValue;
		System.out.println("++Numeric value = " + preIncrementedValue);
	}

	// Step B - Simple "FOR" Loop to increment and decrement variables
	public void addAndRemoveWithForLoop() {

		// B1 - Increasing
		for(int varA = 1; varA <= 10; varA++) {
			System.out.println("VarA value = " + varA);
		}

		// B2 - Decreasing
		for(int varB = 10; varB >= 1; varB--) {
			System.out.println("VarB value = " + varB);
		}
	}

	public void activateButtonWithWhileLoop() {

		// Step C - Using "While" loop
		boolean isButtonActive = false;
		int buttonPressCount = 0;
		while(isButtonActive == false) {
			buttonPressCount++;
			System.out.println("Button press count = " + buttonPressCount);
			if(buttonPressCount == 10) {
				isButtonActive = true;
			}
		}
	}

	// Step D - Using "do-while" loop
	public void insertCarPartsWithDoWhileLoop() {
		int carParts = 0;
		int carPartsInsertionLimit = 5;
		do {
			carParts++;
			System.out.println("+1 car part added!");
			System.out.println("Total inserted car parts = " + carParts);
		}while(carParts < carPartsInsertionLimit);
	}
}
