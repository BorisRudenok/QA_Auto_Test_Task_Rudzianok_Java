package app;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TaskTwo {
    private Scanner in = new Scanner(System.in);
    private String name;

    public String inputName() {
        System.out.println("Начнем задание 2\nВведите ваше имя: ");
        try {
            name = in.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("вы ввели число");
        }
        return name;
    }

    public void checkName(String name) {
        if (name.equalsIgnoreCase("Вячеслав")) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }

    }
}
