package app;


public class TestTask {
    public static void main(String[] args) {
        TaskThree taskThree = new TaskThree();
        TaskOne taskOne = new TaskOne();
        TaskTwo taskTwo = new TaskTwo();
        int[] Array = {3, 9, 5, 12, 5, 6, 2, 7, 9, 55, 6, 24, 999};
        taskOne.checkNumber(taskOne.inputNumber());
        taskTwo.checkName(taskTwo.inputName());
        taskThree.checkArray(Array);
    }
}
