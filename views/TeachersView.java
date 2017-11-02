package views;

import models.Teacher;

public class TeachersView {

    public void outListTeachers(Teacher[] arrayOfTeachers ){
        for(Teacher x: arrayOfTeachers)
            System.out.println(x);
    }
}
