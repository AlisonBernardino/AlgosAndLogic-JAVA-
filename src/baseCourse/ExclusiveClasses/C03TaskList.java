package baseCourse.ExclusiveClasses;

import java.util.Scanner;

public class C03TaskList {
    public static void main(String[] args){
        Scanner analyzer = new Scanner(System.in);
        String taskPaper[][] = new String[24][60];

        int dayVariable;
        int hourVariable;
        int registerContinuation = 0;

        do{
            System.out.println("Insert the task day (1-31) = ");
            dayVariable = analyzer.nextInt();
            System.out.println("Now, enter the task hour = (0-23)");
            hourVariable = analyzer.nextInt();
            System.out.println("Type the task name = ");
            taskPaper[hourVariable][dayVariable] = analyzer.next();
            System.out.println("Task registered successfully!");
            System.out.println("Do you wish to continue? 2 = YES // 3 = NO/EXIT.");
            registerContinuation = analyzer.nextInt();
            if(registerContinuation == 3){
                break;
            }
        }while(registerContinuation != 3);

        System.out.println("================");
        System.out.println("Current taskList");
        for(int day = 1; day < 32; day++){
            for(int hour = 0; hour < 24; hour++){
                System.out.println("Day: " + day + " - Hour: " + hour + " // Task: " + taskPaper[hour][day]);
            }
        }
    }
}
