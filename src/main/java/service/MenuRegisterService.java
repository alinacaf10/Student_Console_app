/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import service.inter.MenuService;
import service.inter.RegisterInter;

/**
 *
 * @author HP
 */
public class MenuRegisterService implements RegisterInter {

    @Override
    public void proccess() {
        System.out.println("Register");
    }
    
}
