/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import bean.Config;
import java.util.Scanner;
import service.inter.LoginInter;

/**
 *
 * @author HP
 */
public class MenuLoginService implements LoginInter {

    @Override
    public void proccess() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Username: ");
        String username = sc.nextLine();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Password: ");

        String password = sc2.nextLine();

        if (!(username.equals("user") && password.equals("1111"))) {
            throw new IllegalArgumentException("user or password is invalid");
        }
        Config.setLoggedin(true);
    }
    

}
