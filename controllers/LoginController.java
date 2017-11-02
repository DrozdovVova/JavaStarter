package controllers;

import models.LoggedUserSignleton;

import java.util.Scanner;

/**
 * Логін користувача
 */
public class LoginController {
    /**
     * Питається  ім'я і пароль користувача
     * Заносить дані у сінглетон
     */
    public void login(){
        Scanner inputDevice = new Scanner(System.in);
        System.out.println("Введіть ім'я:");
        String name = inputDevice.nextLine();
        System.out.println("Введіть прізвище:");
        String surname = inputDevice.nextLine();
        System.out.println("Введіть пароль:");
        String password = inputDevice.nextLine();

        LoggedUserSignleton loggedUserSignleton = LoggedUserSignleton.getInstance();
        loggedUserSignleton.setName(name);
        loggedUserSignleton.setSurname(surname);
        loggedUserSignleton.setPassword(password);
    }
}
