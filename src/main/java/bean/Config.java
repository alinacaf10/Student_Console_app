/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

import java.io.Serializable;

/**
 *
 * @author HP
 */
public class Config implements Serializable{
    private static Config config=null;
    private Student[] student=new Student[0];
    private Teacher[] teacher=new Teacher[0];

    public Student[] getStudent() {
        return student;
    }

    public void setStudent(Student[] student) {
        this.student = student;
    }
    public void appendStudent(Student s){
        Student[] newStudent=new Student[student.length+1];
        for (int i = 0; i < student.length; i++) {
            newStudent[i]=student[i];
            
        }
        newStudent[student.length]=s;
        
        student=newStudent;
        
    }
    public void appendTeacher(Teacher t){
        Teacher[] newTeacher=new Teacher[teacher.length+1];
        for (int i = 0; i < teacher.length; i++) {
            newTeacher[i]=teacher[i];
        }
        newTeacher[teacher.length]=t;
        
        teacher=newTeacher;
        
    }

    public Teacher[] getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher[] teacher) {
        this.teacher = teacher;
    }
    public static Config instance(){
        if (config==null) {
            config=new Config();
        }
        return config;
    }
    
    
}
