package views;

import models.GroupName;
import models.Student;

/**
 * Виводить групу
 */
public class GroupView {

    /**
     * Виводить назву групи
     * @param groupName - назва групи
     */
    public void outGroupName(GroupName[] groupName){
        for (GroupName row: groupName ) {
            System.out.println("Назва грури\t" + row.toString());
        }
    }

    /**
     * Виводить список студнтів групи
     * @param listStudents список студентів
     */
    public void outListStudents(Student[] listStudents){
        for(Student stud: listStudents){
            System.out.println(stud);
        }
    }
}
