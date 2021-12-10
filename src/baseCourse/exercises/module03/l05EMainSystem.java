package baseCourse.exercises.module03;

import java.util.Scanner;

public class l05EMainSystem {
    public static void main(String[] args){
        Scanner clientInteraction = new Scanner(System.in);
        String chosenMeal = "";

        System.out.println("Welcome to Golden Meal System v1.0");
        System.out.println("Meals - MENU");
        System.out.println("Please, choose one of our available meals = ");
        System.out.println("[1] = Cheeseburger");
        System.out.println("[2] = Pizza");
        System.out.println("[3] = Barbecue");
        System.out.println("Your choice = ");
        int menuChoice = clientInteraction.nextInt();

        switch(menuChoice){
            case 1:
                System.out.println("=====================");
                System.out.println("=== Order details ===");
                l05BCheeseburger burgerChoice = new l05BCheeseburger();
                chosenMeal = "Cheeseburger";
                System.out.println("You have selected the option #01 - Cheeseburger");
                System.out.println("Please, choose the main meat type = ");
                String meatSelection = clientInteraction.next();
                System.out.println("Now, select the extra choice = ");
                String extraChoice = clientInteraction.next();
                System.out.println("In the end, choose the desired drink = ");
                String selectedDrink = clientInteraction.next();

                burgerChoice.calculateTotalOrderPrice();
                burgerChoice.calculateDeliveryTime();

                System.out.println("=====================");
                System.out.println("=== Selected items ===");
                System.out.println("Main meat = " + meatSelection);
                System.out.println("Extra choice = " + extraChoice);
                System.out.println("Drink choice = " + selectedDrink);
                break;
            case 2:
                System.out.println("=====================");
                System.out.println("=== Order details ===");
                l05CPizza pizzaChoice = new l05CPizza();
                chosenMeal = "Pizza";
                System.out.println("You have selected the option #02 - Pizza");
                System.out.println("Please, select the desired sauce = ");
                String selectedSauce = clientInteraction.next();
                System.out.println("Now, insert the flavor 01 choice = ");
                String selectedFlavor01 = clientInteraction.next();
                System.out.println("You can insert a 2nd flavor = ");
                String selectedFlavor02 = clientInteraction.next();
                System.out.println("To finish the order, select the desired drink type = ");
                selectedDrink = clientInteraction.next();

                pizzaChoice.calculateTotalOrderPrice();
                pizzaChoice.calculateDeliveryTime();

                System.out.println("=====================");
                System.out.println("=== Selected items ===");
                System.out.println("Sauce = " + selectedSauce);
                System.out.println("Pizza flavor 01 = " + selectedFlavor01);
                System.out.println("Pizza flavor 02 = " + selectedFlavor02);
                System.out.println("Drink = " + selectedDrink);
                break;
            case 3:
                System.out.println("=====================");
                System.out.println("=== Order details ===");
                l05DBarbecue barbecueChoice = new l05DBarbecue();
                chosenMeal = "Barbecue";
                System.out.println("You have selected the option #03 - Barbecue");
                System.out.println("Please, select the desired meat type = ");
                String selectedMeatType = clientInteraction.next();
                System.out.println("Insert your extra choice = ");
                extraChoice = clientInteraction.next();
                System.out.println("To finish the order, select the desired drink type = ");
                selectedDrink = clientInteraction.next();

                barbecueChoice.calculateTotalOrderPrice();
                barbecueChoice.calculateDeliveryTime();

                System.out.println("=====================");
                System.out.println("=== Selected items ===");
                System.out.println("Meat type = " + selectedMeatType);
                System.out.println("Extra choice = " + extraChoice);
                System.out.println("Drink = " + selectedDrink);
                break;
            default:
                System.out.println("Error! Invalid order number. Please, select your meal again");
        }
    }
}
