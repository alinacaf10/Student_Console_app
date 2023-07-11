/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.util.Scanner;
import service.MenuLoginService;
import service.MenuRegisterService;
import service.inter.MenuService;

/**
 *
 * @author HP
 */
public enum Menu {
    LOGIN(1, "Login", new MenuLoginService()),
    REGISTER(2, "Register", new MenuRegisterService()),
    ADD_STUDENT(3, "Add_Student", null),
    ADD_TEACHER(4, "Add_Teacher", null),
    SHOW_STUDENT(5, "Show_Student", null),
    SHOW_TEACHER(6, "Show_Teacher", null),
    UNKNOWN;
    private String label;
    private MenuService service;
    private int number;

    Menu() {
    }

    Menu(int number, String label, MenuService service) {
        this.label = label;
        this.service = service;
        this.number = number;
    }

    public String getLabel() {
        return label;
    }

    public void proccess() {
        service.proccess();
    }

    @Override
    public String toString() {
        return number+"."+label;
    }

    public int getNumber() {
        return number;
    }

    public static Menu find(int number) {
        Menu[] menu = Menu.values();

        for (int i = 0; i < menu.length; i++) {
            if (menu[i].getNumber() == number) {
                return menu[i];
            }
        }
        return Menu.UNKNOWN;
    }

    public static void showAllMenu() {
        Menu[] menu = Menu.values();

        for (int i = 0; i < menu.length; i++) {
            if (menu[i] != UNKNOWN) {
                System.out.println(menu[i]);

            }
        }
    }

}
