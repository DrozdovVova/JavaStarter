package controllers;

import models.GroupName;
import models.Student;
import models.Teacher;

/**
 * База данных :), учителей, груп, студентов
 */

public class BaseOfTeachAndStud {

    public Teacher[] baseTeachers(){
        Teacher javaStarter = new Teacher("Ihor", "L","Java Starter");
        Teacher cStarter = new Teacher("Andrey", "A", "C# Starter");
        Teacher javaScriptStarter = new Teacher("Yura", "S", "JavaScript Starter");
        return new Teacher[]{javaStarter,cStarter,javaScriptStarter};
    }

    public GroupName[] baseGroupName(){
        GroupName groupNames1 = new GroupName("Java Starter", 12);
        GroupName groupNames2 = new GroupName("C# Starter", 12);
        GroupName groupNames3 = new GroupName("JavaScript Starter", 12);
        return new GroupName[]{groupNames1, groupNames2, groupNames3};
    }
    public Student[] baseStudent() {
        Student student1 = new Student("Andriy1", "Johnson1", 26);
        Student student2 = new Student("Andriy2", "Johnson2", 27);
        Student student3 = new Student("Andriy3", "Johnson3", 28);
        Student student4 = new Student("Andriy4", "Johnson4", 29);
        return new Student[]{student1, student2, student3, student4};
    }
}
