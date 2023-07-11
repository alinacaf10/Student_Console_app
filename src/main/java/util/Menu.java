/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import service.MenuLoginService;
import service.MenuRegisterService;
import service.MenuService;

/**
 *
 * @author HP
 */
public enum Menu {
    LOGIN("Login",new MenuLoginService()),
    REGISTER("Register",new MenuRegisterService()),
    ADD_STUDENT("Add_Student",null),
    ADD_TEACHER("Add_Teacher",null),
    SHOW_STUDENT("Show_Student",null),
    SHOW_TEACHER("Show_Teacher",null);
    private String label;
    private MenuService service;

     Menu(String label,MenuService service) {
        this.label = label;
        this.service=service;
    }

    public String getLabel() {
        return label;
    }
    public void proccess(){
        service.proccess();
    }

    @Override
    public String toString() {
        return label;
    }
     
    
}
