package controllers;

import models.GroupName;
import models.Student;
import views.GroupView;

import java.util.Scanner;

/**
 * виводить список студентів групи
 */
public class GroupStudentsController {

    /**
     * Виводить список студентів
     */
    public void listGroup(){
        GroupView groupView = new GroupView();
        BaseOfTeachAndStud baseOfTeachAndStud = new BaseOfTeachAndStud();
        groupView.outGroupName(baseOfTeachAndStud.baseGroupName());
    }

    public void listStudents(){
        Scanner inputDevice = new Scanner(System.in);
        System.out.println("Введіть назву групи:");
        String cmd = inputDevice.nextLine();
        GroupView groupView = new GroupView();
        BaseOfTeachAndStud baseOfTeachAndStud = new BaseOfTeachAndStud();
        if(cmd.equals("Java Starter")){
            groupView.outListStudents(baseOfTeachAndStud.baseStudent());
        }
    }

}
