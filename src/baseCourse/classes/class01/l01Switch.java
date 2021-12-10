package baseCourse.classes.class01;

import java.util.Scanner;

public class l01Switch {
    public static void main(String[] args){
        Scanner scanModule = new Scanner(System.in);

        System.out.println("Type your favorite methodology = ");
        String favoriteMethodology = scanModule.next();

        switch(favoriteMethodology){
            case "Agile":
                System.out.println("Nice choice!");
                break;
            case "SCRUM":
                System.out.println("Good job!");
                break;
            case "Kanban":
                System.out.println("Well done!");
                break;
            default:
                System.out.println("Error! We couldnt identify the chosen methodology. Please, re-type this information");
        }
        if(favoriteMethodology.equals("Agile") || favoriteMethodology.equals("SCRUM") || favoriteMethodology.equals("Kanban")) {
            System.out.println("Chosen methodology = " + favoriteMethodology);
        }
    }
}
