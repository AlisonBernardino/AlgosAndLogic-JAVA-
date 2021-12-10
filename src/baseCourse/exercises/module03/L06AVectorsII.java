package baseCourse.exercises.module03;

import java.util.Arrays;

public class L06AVectorsII {
    int[] agesRegister = new int[15];

    // To sum 02 indexes values - Method 01
    int smallAgeSum = agesRegister[0] + agesRegister[2];

    // To sum 02 indexes values - Method 02
    int specialSum = agesRegister[3] += agesRegister[4];

    // To relate 02 indexes values
    // agesRegister[0] == agesRegister[3];

    // Logical operators
    boolean isEqual = (agesRegister[1] == agesRegister[2]
            || agesRegister[4] == agesRegister[5]);
}
