package controllers;

import models.Teacher;
import views.TeachersView;

public class TeachersControllers {

    public void listTeachers(){

        BaseOfTeachAndStud baseOfTeachAndStud = new BaseOfTeachAndStud();
        TeachersView teachersView = new TeachersView();
        teachersView.outListTeachers(baseOfTeachAndStud.baseTeachers());


    }
}
