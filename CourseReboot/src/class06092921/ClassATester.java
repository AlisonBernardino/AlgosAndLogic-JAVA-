package class06092921;

import java.util.Scanner;

public class ClassATester {
	public static void main(String[] args) {
		ClassA car01 = new ClassA();
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Insert the gasoline quantity = ");
		car01.gasolineQuantity = userInput.nextFloat();
		// car01.gasolineQuantity = 95.5f;
		car01.showGasolineStatus();
		car01.showNewGasolineStatus();
		
		System.out.println(car01.showCarMarksByLetter());
		car01.showVehicleEngines();
	}
}
