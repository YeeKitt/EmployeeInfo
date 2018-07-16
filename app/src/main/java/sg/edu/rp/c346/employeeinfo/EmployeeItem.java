package sg.edu.rp.c346.employeeinfo;

/**
 * Created by 16030820 on 16/7/2018.
 */

public class EmployeeItem {

    private String name;
    private String title;
    private double Salary;

    public EmployeeItem(String name, String title, double salary) {
        this.name = name;
        this.title = title;
        Salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    @Override
    public String toString() {
        return "EmployeeItem{" +
                "name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", Salary=" + Salary +
                '}';
    }
}
