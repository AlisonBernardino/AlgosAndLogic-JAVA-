package baseCourse.exercises.module03;

import java.util.Scanner;

public class l05DBarbecue extends l05AMeal{
    private String meatType;
    private float meatTypePrice = 15.0f;
    private String extraChoice;
    private float extraChoicePrice = 2.0f;
    private String drinkType;
    private float drinkTypePrice = 4.5f;
    private float ambientTemperature;

    @Override
    public void setTotalPreparationTime(){
        totalPreparationTime = 30;
    }

    @Override
    public void calculateTotalOrderPrice(){
        totalOrderPrice += meatTypePrice + extraChoicePrice + drinkTypePrice;
        System.out.println("Total order price = R$ " + totalOrderPrice + ".");
    }

    @Override
    public void calculateDeliveryTime(){
        float deliveryTime = 1.5f;
        Scanner userInput = new Scanner(System.in);
        System.out.println("Insert the order distance (In km) = ");
        orderDistance = userInput.nextFloat();
        totalDeliveryTime = deliveryTime * orderDistance;
        System.out.println("Estimated delivery time = " + totalDeliveryTime + " minutes.");
    }

    public void setAmbientTemperature(){
        ambientTemperature = 32.2f;
    }
}
