package app;


public class TaskThree {
    public void checkArray(int[] inputArray) {
        for (int j : inputArray) {
            if (j % 3 == 0) {
                System.out.println(j);
            }
        }
    }
}
