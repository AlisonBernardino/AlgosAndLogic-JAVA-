package baseCourse.exercises.module03;

import java.util.Scanner;

public class l05CPizza extends l05AMeal{
    private String selectedSauce;
    private float selectedSaucePrice = 3.5f;
    // TODO - Create a vector with 03 pizza flavors
    private String flavor01Choice;
    private float flavor01ChoicePrice = 25.0f;
    private String flavor02Choice;
    private float flavor02ChoicePrice = 30.0f;
    private String drinkChoice;
    private float drinkChoicePrice = 7.5f;

    @Override
    public void setTotalPreparationTime(){
        totalPreparationTime = 40;
    }

    @Override
    public void calculateTotalOrderPrice(){
        totalOrderPrice += selectedSaucePrice + flavor01ChoicePrice + flavor02ChoicePrice + drinkChoicePrice;
        System.out.println("Total order price = R$ " + totalOrderPrice);
    }

    @Override
    public void calculateDeliveryTime(){
        float deliveryTime = 3;
        Scanner userInput = new Scanner(System.in);
        System.out.println("Insert the order distance (In km) = ");
        orderDistance = userInput.nextFloat();
        totalDeliveryTime = deliveryTime * orderDistance;
        System.out.println("Estimated delivery time = " + totalDeliveryTime + " minutes.");
    }
}
