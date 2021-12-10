package baseCourse.classes.class01;

import baseCourse.classes.class01.Structures;

public class structuresMain {
    public static void main(String[] args){
        // Check conditions = If the water bottle content
        // is higher than 8.5f, the athlete can take it
        // to the tournament. Otherwise, not.
        Structures athlete01 = new Structures();
        athlete01.setCurrentWaterBottle(12.5f);
        athlete01.setNeededWater(8.5f);

        // Conditional structure
        if(athlete01.currentWaterBottle >= 8.5){
            System.out.println("Water bottle can be used!");
            System.out.println("Reason = Sufficient water!");
        }else{
            System.out.println("Water bottle not available for use!");
            System.out.println("Reason = Insufficient water");
        }

        athlete01.checkWaterLevel();

        System.out.println("Current water bottle = " + athlete01.getCurrentWaterBottle());
        System.out.println("Minimum needed water = " + athlete01.getNeededWater());

        athlete01.checkAthleteAge();
        athlete01.configureRunningModality();

        // 09/30/2021 - Step A - Structures test

        Structures structureTest = new Structures();

        structureTest.configureRunningModality();

        // Step B - Repetition structures test
        Structures whileLoop01 = new Structures();
        whileLoop01.whileCounter();

        // Step C - Increment and decrement operators
        Structures incrementAndDecrementTest = new Structures();
        incrementAndDecrementTest.incrementOperation();
        incrementAndDecrementTest.decrementOperation();

        // Step D - "For" loops - Increment && decrement
        Structures forLoopUpDown = new Structures();
        forLoopUpDown.forLoopDecrement();
        forLoopUpDown.forLoopIncrement();

        // 01/10/2021
        // Step A - Exercises correction - Main class

        System.out.println("====== 09/30/2021 - Step A - Exercises correction ====");
        System.out.println("==== Exercise 01 ====");

        Structures athleteData = new Structures();

        // To print the athlete names data
        System.out.println("======== Registered names data ========");
        System.out.println(athleteData.collectFirstName() + " '" + athleteData.collectNickname() + "' " + athleteData.collectLastName());

        // Exercise 02
        // To collect and process the final mentions and medals
        System.out.println("");
        System.out.println("====== Exercise 02 ======");
        System.out.println("======== Hercules League Challenge - Results");
        athleteData.collectAndProcessMentions();

        // Exercise 03 - Type A ("If-else" statement)
        System.out.println("");
        System.out.println("====== Exercise 03 ======");
        System.out.println("=== Athlete positions - Type A - If-else statement =====");
        athleteData.writtenOutPositionsTypeA();

        // Type B ("Switch" operator)
        System.out.println("=== Athlete positions - Type B - Switch operator =====");
        athleteData.writtenOutPositionsTypeB();

        // Exercise 04 - Type A - "For" statement
        System.out.println(" ");
        System.out.println("======= Exercise 04 - Type A - 'For' statement ======");
        athleteData.captureObjectTypeA();

        // Exercise 04 - Type B - "While" statement
        System.out.println(" ");
        athleteData.captureObjectTypeB();

        // Exercise 04 - Type C - "Do-while" statement
        System.out.println(" ");
        athleteData.captureObjectTypeC();

        // Step B - Ternary "If" operator
        System.out.println("====== Ternary If operator ======");
        Structures ternaryIfOperation = new Structures();
        ternaryIfOperation.showTernaryIf();
    }
}
