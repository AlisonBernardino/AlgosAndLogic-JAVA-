package class06092921;

import java.util.Scanner;

public class ClassA {
	// Single line comment

	/*
	 * Multiple lines comment
	 * */

	/**
	 * Project documentation (Example: javadoc)
	 * 
	 */

	float gasolineQuantity = 80.5f;

	public void showGasolineStatus() {
		if(gasolineQuantity >= 75f && gasolineQuantity <= 100f) {
			System.out.println("Fuel level = GREEN");
		}else {
			System.out.println("Fuel level = RED");
		}
	}

	public void showNewGasolineStatus() {
		if(gasolineQuantity >= 75f && gasolineQuantity <= 100f){ 
			System.out.println("Fuel level = GREEN");
		}else if(gasolineQuantity >= 50f && gasolineQuantity < 75f) {
			System.out.println("Fuel level = YELLOW");
		}else{
			System.out.println("Fuel level = RED");
		}
	}

	public String showCarMarksByLetter() {
		System.out.println("Insert your desired car mark initial letter = ");
		Scanner userInsertion = new Scanner(System.in);
		String typedLetter = userInsertion.next();
		String systemAnswer = null;
		
		switch(typedLetter) {
		case "L":
			systemAnswer = "Lotus";
			break;
		case "B":
			systemAnswer = "BMW";
			break;
		case "F":
			systemAnswer = "Ferrari";
			break;
		default: 
			systemAnswer = "Error! Vehicle mark not found. Please, try again!";
			break;
		}
		return systemAnswer;
	}
}
