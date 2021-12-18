package app;


import java.util.Arrays;

public class TaskThree {
    public void checkArray(int[] inputArray) {
        int[] resultArray = Arrays.stream(inputArray).filter(i -> i % 3 == 0).toArray();
        System.out.println(Arrays.toString(resultArray));
    }
}
