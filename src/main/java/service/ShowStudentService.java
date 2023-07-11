/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import bean.Config;
import bean.Student;
import service.inter.ShowStudentInter;

/**
 *
 * @author HP
 */
public class ShowStudentService implements ShowStudentInter {

    @Override
    public void proccess() {
        Student[] all=Config.instance().getStudent();
        for (int i = 0; i < all.length; i++) {
            System.out.println(all[i]);
        }
    }
    
}
