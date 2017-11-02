import controllers.GroupStudentsController;
import controllers.LoginController;
import controllers.TeacherAndStudentsController;
import controllers.TeachersControllers;
import models.LoggedUserSignleton;

import java.util.Scanner;
public class Main {

    /**
     * Запускає програму обліку студентів у групі
     * @param args
     */
    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        String cmd = "list group";
        Scanner inputDevice = new Scanner(System.in);

        String[] commandsList = {"list group", "list students", "group info","list of teachers", "login", "exit"};

        GroupStudentsController groupStudentsController = new GroupStudentsController();
        TeachersControllers teachersControllers = new TeachersControllers();
        TeacherAndStudentsController teacherAndStudentsController = new TeacherAndStudentsController();
        boolean isEnd = false;

        while( !isEnd){
            System.out.println("Введіть команду, ? - help:");
            cmd = inputDevice.nextLine();
            LoggedUserSignleton loggedUserSignleton = LoggedUserSignleton.getInstance();
            switch (cmd) {
                case "group info":
                    if(loggedUserSignleton.isLoggedUser()) {
                        teacherAndStudentsController.infoGroupTeachAndStud();
                    }
                    break;
                case "list group":
                    if(loggedUserSignleton.isLoggedUser()) {
                        groupStudentsController.listGroup();
                    } else {
                        System.out.println("You are not logged!");
                    }
                    break;
                case "list students":
                    if(loggedUserSignleton.isLoggedUser()) {
                        groupStudentsController.listStudents();
                    } else {
                        System.out.println("You are not logged!");
                    }
                    break;
                case "list of teachers":
                    if(loggedUserSignleton.isLoggedUser()) {
                        teachersControllers.listTeachers();
                    }
                    break;

                case "exit":
                    isEnd = true;
                    break;
                case "?":
                    for(String str: commandsList){
                        System.out.println(str);
                    }
                    break;
                case "login":
                    LoginController loginController = new LoginController();
                    loginController.login();
                    break;
            }
        }
    }
}
