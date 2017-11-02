package models;

public class LoggedUserSignleton {
    private String name;
    private String surname;
    private String password = "";
    private boolean isLoggedUser = false;

    private static LoggedUserSignleton ourInstance = new LoggedUserSignleton();

    public static LoggedUserSignleton getInstance() {
        return ourInstance;
    }

    private LoggedUserSignleton() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isLoggedUser() {
        if(this.password.equals("ok")){
            this.isLoggedUser = true;
        }
        return isLoggedUser;
    }
}
