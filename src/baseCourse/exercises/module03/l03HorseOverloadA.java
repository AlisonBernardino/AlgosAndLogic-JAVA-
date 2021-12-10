package baseCourse.exercises.module03;

public class l03HorseOverloadA {
    // "Race" method 01
    public void race(String racingTrack){
        System.out.println("The horse is racing in the following track = " + racingTrack);
    }

    // "Race" method 02
    public void race(int horsePosition){
        System.out.println("Position = " + horsePosition);
    }

    // "Race" method 01
    public void race(String racingTrack, int horsePosition){
        System.out.println("The " + horsePosition + " is racing in the " + racingTrack + " track.");
    }
}
