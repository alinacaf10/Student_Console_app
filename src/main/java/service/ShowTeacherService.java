/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import bean.Config;
import bean.Teacher;
import service.inter.ShowTeacherInter;

/**
 *
 * @author HP
 */
public class ShowTeacherService implements ShowTeacherInter {

    @Override
    public void proccess() {
        Teacher[] all=Config.instance().getTeacher();
        for (int i = 0; i < all.length; i++) {
            System.out.println(all[i]);
        }
    }
    
}
