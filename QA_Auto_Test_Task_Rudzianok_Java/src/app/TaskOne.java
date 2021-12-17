package app;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TaskOne {
    private Scanner in = new Scanner(System.in);
    private float num;

    public float inputNumber() {
        System.out.println("Введите ваше число:");
        try {
            num = in.nextFloat();
        } catch (InputMismatchException e) {
            System.out.println("вы ввели не число");
        }
        return num;
    }

    public void checkNumber(float num) {
        if (num > 7) {
            System.out.println("Привет");
        } else {
            System.out.println("Вы ввели не чило либо веденное число равно или меньше 7");
        }
    }
}
