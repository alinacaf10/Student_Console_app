/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import bean.Config;
import bean.Student;
import java.util.Scanner;
import service.inter.AddStudentInter;

/**
 *
 * @author HP
 */
public class AddStudentsService implements AddStudentInter {

    @Override
    public void proccess() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Name: ");
        String name=sc.nextLine();
        
        Scanner sc2=new Scanner(System.in);
        System.out.println("Surname: ");
        String surname=sc2.nextLine();
        
        Scanner sc3=new Scanner(System.in);
        System.out.println("Age: ");
        int age=sc3.nextInt();
        
        Scanner sc4=new Scanner(System.in);
        System.out.println("Salary: ");
        double salary=sc4.nextDouble();
        
        Scanner sc5 = new Scanner(System.in);
        System.out.println("Schoolname: ");
        String schoolname = sc5.nextLine();
        
        Student s=new Student();
        s.setName(name);
        s.setSurname(surname);
        s.setAge(age);
        s.setSalary(salary);
        s.setSchoolName(schoolname);
        
        Config.instance().appendStudent(s);   }
    
}
