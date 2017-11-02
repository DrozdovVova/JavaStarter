package models;

/**
 * Орисує групу студентів
 */
public class GroupName {
    private String name;
    private int amountStudents;

    public GroupName(String name, int amountStudents) {
        this.name = name;
        this.amountStudents = amountStudents;
    }

    public GroupName() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmountStudents() {
        return amountStudents;
    }

    public void setAmountStudents(int amountStudents) {
        this.amountStudents = amountStudents;
    }

    @Override
    public String toString() {
        return "GroupName{" +
                "name='" + name + '\'' +
                ", amountStudents=" + amountStudents +
                '}';
    }
}
