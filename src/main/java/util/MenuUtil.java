/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class MenuUtil {

    public static void showMenu() {
        Menu.showAllMenu();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter operation number");
        int number = sc.nextInt();

       Menu selected = Menu.find(number);
       selected.proccess();


    }

    public static void proccessMenu(Menu menu) {
        menu.proccess();
    }
}
