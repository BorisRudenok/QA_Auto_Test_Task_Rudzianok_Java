package app;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TaskOne {
    private Scanner in = new Scanner(System.in);
    private Float num;

    public Float inputNumber() {
        System.out.println("Введите ваше число:");
        try {
            num = in.nextFloat();
        } catch (InputMismatchException e) {
            return num;
        }
        return num;
    }

    public void checkNumber(Float num) {
        try {
            String massage = (num > 7) ? "Привет" : "Вы ввели число равно или меньше 7";
            System.out.println(massage);
        } catch (Exception e) {
            System.out.println("Вы ввели не число");
        }
    }
}
