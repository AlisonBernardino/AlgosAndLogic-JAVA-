package baseCourse.classes.class01;

import java.util.Scanner;

public class Structures {
    // Date: 09292021
    // Theme: Structures

    float currentWaterBottle, neededWater;
    int minimumAthleteAge = 14, currentAthleteAge = 18;
    int herculesLeagueAgeNeeded = 18;

    // "Getters" and "Setters" methods
    public float getCurrentWaterBottle(){
        return currentWaterBottle;
    }

    public void setCurrentWaterBottle(float currentWaterRecipient){
        this.currentWaterBottle = currentWaterRecipient;
    }

    public float getNeededWater(){
        return neededWater;
    }

    public void setNeededWater(float neededLiquid){
        this.neededWater = neededLiquid;
    }

    public int getCurrentAthleteAge(){
        return this.currentAthleteAge;
    }

    public void setCurrentAthleteAge(int currentParticipantAge){
        this.currentAthleteAge = currentParticipantAge;
    }

    public int getHerculesLeagueAgeNeeded(){
        return this.herculesLeagueAgeNeeded;
    }

    public void setHerculesLeagueAgeNeeded(int officialLeagueAgeNeeded){
        this.herculesLeagueAgeNeeded = officialLeagueAgeNeeded;
    }

    // Creating a method inside the class
    public void checkWaterLevel(){
        if(currentWaterBottle == 0){
            System.out.println("Attention: The water bottle is empty!");
        }else{
            System.out.println("Checking water level...");
        }
    }

    public void checkAthleteAge(){
        if(currentAthleteAge >= 18){
            System.out.println("The athlete can run on the Hercules League!");
            System.out.println("Hercules League age needed = " + herculesLeagueAgeNeeded);
        }else if(currentAthleteAge >= minimumAthleteAge){
            System.out.println("The athlete can run on the Teen Hercules League");
            System.out.println("Teen League age needed = " + minimumAthleteAge);
            System.out.println("Current athlete age = " + currentAthleteAge);
        }else{
            System.out.println("Error! The athlete is under the minimum ages.");
            System.out.println("Athlete age needed = " + minimumAthleteAge);
            System.out.println("Current athlete age = " + currentAthleteAge);
        }
    }

    public String configureRunningModality(){
        System.out.println(" ========= A.M.S. = Athlete Management System v1.0");
        System.out.println("Now, lets choose the athlete activities group.");
        System.out.println("Groups options: Alpha, Bravo, Echo, Foxtrot");
        System.out.println("Insert your running modality from the group options: ");

        Scanner dataInput = new Scanner(System.in);

        String dataAnswer = dataInput.next();

        // Using the "switch-case" function
        switch(dataAnswer){
            case "Alpha":
                System.out.println("You selected Alpha as Running Modality A!");
                break;
            case "Beta":
                System.out.println("You selected Beta as a Running Modality A!");
                break;
            case "Echo":
                System.out.println("You selected Echo as Running Modality B!");
                break;
            case "Foxtrot":
                System.out.println("You selected Foxtrot as Running Modality B!");
                break;
            default:
                System.out.println("No language selected for now!");
                break;
        }
        return null;
    }

    // 09/30/2021 - 10:14 AM - Repetition structures

    public void whileCounter(){
    // While
        int specificCounter = 0;

        System.out.println("======== Repetition structures =======");
        System.out.println("=== While ===");
        while(specificCounter <= 8){
            System.out.println("Current number = " + specificCounter);
            specificCounter++;
        }
    }

    public void incrementOperation(){
        int variableA = 0;

        // Showing the variable and incrementing the value
        variableA = variableA++;
        System.out.println("Variable A incremented after the reading. Result = " + variableA);

        // Resetting the variable
        variableA = 0;

        // Incrementing the value and showing the variable
        variableA = ++variableA;
        System.out.println("Variable A incremented before the reading. Result = " + variableA);
    }

    public void decrementOperation(){
        int variableB = 0;

        // Showing the variable and decrementing the value
        variableB = variableB--;
        System.out.println("Variable B decremented after the reading. Result = " + variableB);

        // Resetting the variable B
        variableB = 0;

        // Decrementing the value and showing the variable
        variableB = --variableB;
        System.out.println("Variable B decremented before the reading. Result = " + variableB);
    }

    // Step D - To build the "for" loop
    // Increment
    public void forLoopIncrement(){
        System.out.println("========= Increment loop ========");
        System.out.println("Starting value = 0");
        for(int countBase = 0;countBase <= 10;countBase++){
            System.out.println("Current value = " + countBase);
        }
    }

    // Decrement
    public void forLoopDecrement(){
        System.out.println("========= Decrement loop ========");
        System.out.println("Starting value = 10");
        for(int subtractionValue = 10;subtractionValue >=0; subtractionValue--){
            System.out.println("Current value = " + subtractionValue);
        }
    }

    // Step E - Do-while loop
    public void doWhileIncrement(){
    int startingBottles = 10;
        do{
            System.out.println("Water bottles = " + startingBottles);
            startingBottles++;
        }while(startingBottles <=20);
    }

    // 10/01/2021 - Exercises correction
    // Exercise 01 -

    Scanner dataInput = new Scanner(System.in);

    public String collectFirstName(){
        System.out.println("Please, type the athlete first name = ");
        String athleteFirstName = dataInput.next();
        return athleteFirstName;
    }

    public String collectLastName(){
        System.out.println("Now, insert the athlete last name = ");
        String athleteLastName = dataInput.next();
        return athleteLastName;
    }

    public String collectNickname(){
        System.out.println("And now, insert the athlete nickname = ");
        String athleteNickname = dataInput.next();
        return athleteNickname;
    }

    // Exercise 02 -
    public void collectAndProcessMentions(){
        // To collect the athlete mentions
        System.out.println("We will register the athlete games mentions");
        System.out.println("Insert the 1st mention = ");
        float mention01 = dataInput.nextFloat();
        System.out.println("Now, insert the 2nd mention = ");
        float mention02 = dataInput.nextFloat();
        System.out.println("Insert the 3rd mention = ");
        float mention03 = dataInput.nextFloat();
        System.out.println("To finish, insert the 4th mention = ");
        float mention04 = dataInput.nextFloat();

        // To calculate the average
        float mentionAverage = (mention01 + mention02 + mention03 + mention04) / 4;
        String congratulationsMessage = "Congratulations! ";

        if(mentionAverage >= 10){
            System.out.println(congratulationsMessage += "You won the DIAMOND medal!");
        }else if(mentionAverage >= 7){
            System.out.println(congratulationsMessage += "You won the GOLDEN medal!");
        }else if(mentionAverage >= 5){
            System.out.println(congratulationsMessage += "You won the SILVER medal!");
        }else if(mentionAverage >= 3){
            System.out.println(congratulationsMessage += "You won the BRONZE medal!");
        }else{
            System.out.println(congratulationsMessage += "You have completed the Hercules League Challenge!");
        }

        System.out.println("Final mention = " + mentionAverage);
    }

    // Exercise 03 - Type A (If-else statement)
    // Written out (Posições por extenso)
    public void writtenOutPositionsTypeA(){
        System.out.println("====== Athlete position ======");
        System.out.println("Please, insert the athlete position in numbers:");
        byte positionNumberA = dataInput.nextByte();

        // Type A - "If-else" statement
        if(positionNumberA == 1){
            System.out.println("FIRST position!");
        }else if(positionNumberA == 2){
            System.out.println("SECOND position!");
        }else if(positionNumberA == 3){
            System.out.println("THIRD position!");
        }else if(positionNumberA == 4){
            System.out.println("FOURTH position!");
        }else if(positionNumberA == 5){
            System.out.println("FIFTH position!");
        }else{
            System.out.println("Error! No position detected! Please, check this information and try again!");
        }
    }

    public void writtenOutPositionsTypeB(){
        // Type B - "Switch" statement

        System.out.println("Now, insert the position to see the result via type B (Switch operator)");
        System.out.println("Position = ");
        byte positionNumberB = dataInput.nextByte();
        switch(positionNumberB){
            case 1:
                System.out.println("FIRST athlete.");
                break;
            case 2:
                System.out.println("SECOND athlete.");
                break;
            case 3:
                System.out.println("THIRD athlete.");
                break;
            case 4:
                System.out.println("FOURTH athlete.");
                break;
            case 5:
                System.out.println("FIFTH athlete.");
                break;
            default:
                System.out.println("Error! The position number is invalid! Please, try again.");
        }
    }

    // Exercise 04 - Type A - "For" statement
    public void captureObjectTypeA(){
        // To capture the object
        System.out.println("Enter the object to be iterated = ");
        String capturedObjectTypeA = dataInput.next();

        // To print the object 5 times
        for(int repeater = 1; repeater <= 5; repeater++){
            System.out.println("Repetition number = " + repeater);
            System.out.println("Received object = " + capturedObjectTypeA);
        }
    }

    // Exercise 04 - Type B - "While" statement
    public void captureObjectTypeB(){
        System.out.println("=== Type B - 'While' statement ===");
        int counter = 1;
        System.out.println("Insert the item to be looped = ");
        String capturedObjectTypeB = dataInput.next();

        while(counter <= 6){
            System.out.println("Repetition number = " + counter);
            System.out.println("Item = " + capturedObjectTypeB);
            counter++;
        }
    }

    // Exercise 04 - Type C - "Do-while" statement
    public void captureObjectTypeC(){
        System.out.println("=== Type C - 'Do-while' statement ===");
        int loopChecker = 1;
        System.out.println("Type the car part to be repeated = ");
        String capturedObjectTypeC = dataInput.next();

        do{
            System.out.println("Loop number = " + loopChecker);
            System.out.println("Registered car part = " + capturedObjectTypeC);
            loopChecker++;
        }while(loopChecker <= 7);
    }


    // Step B - Ternary "If" operator
    public void showTernaryIf(){
        System.out.println("Type a number larger than 0 and smaller than 30 = ");
        int ternaryIfValue = dataInput.nextInt();

        String valueChecker = (ternaryIfValue > 15) ? "Value larger than 15" : "Value smaller than 15";

        System.out.println(valueChecker);
    }
}
