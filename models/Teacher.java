package models;

/**
 * Описує вчителя
 */
public class Teacher {
    private String name;
    private String surname;
    private String lesson;

    public Teacher(String name, String surname, String lesson) {
        this.name = name;
        this.surname = surname;
        this.lesson = lesson;
    }

    public Teacher() {
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

    public String getLesson() {
        return lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", lesson='" + lesson + '\'' +
                '}';
    }
}
