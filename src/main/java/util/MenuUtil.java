/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

/**
 *
 * @author HP
 */
public class MenuUtil {
    
    public static void showMenu(){
        Menu[] menu=Menu.values();
        for (int i = 0; i < menu.length; i++) {
            System.out.println(menu[i]);
        }
    }
    public static void proccessMenu(Menu menu){
        menu.proccess();
    }
}
