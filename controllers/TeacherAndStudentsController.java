package controllers;
import models.GroupName;
import models.Student;
import models.Teacher;
import java.util.Scanner;

/**
 * выводит учителя и его группу
 */
public class TeacherAndStudentsController {

    /**
     * выводит название групы, преподавателя и список студентов
     */
    public void infoGroupTeachAndStud() {

        Scanner inputLesson = new Scanner(System.in);
        System.out.println("Список предметов:\n"+"Java Starter\n"+"C# Starter\n"+"JavaScript Starter");
        System.out.println("Введите предмет:");
        String lesson = inputLesson.nextLine();
        BaseOfTeachAndStud baseOfTeachAndStud = new BaseOfTeachAndStud();
        Teacher[] teachers = baseOfTeachAndStud.baseTeachers();
        GroupName[] groupNames = baseOfTeachAndStud.baseGroupName();
        Student[] students = baseOfTeachAndStud.baseStudent();

        for (GroupName g: groupNames){
            if((g.getName().toLowerCase()).equals(lesson.toLowerCase())) {
                System.out.println(g);
                break;
            }
        }
        for (Teacher x: teachers) {
            if((x.getLesson().toLowerCase()).equals(lesson.toLowerCase())) {
                System.out.println(x);

                break;
            } else System.out.println("qq");

        }
        for (Student s: students){
            System.out.println(s);
        }

    }
}
