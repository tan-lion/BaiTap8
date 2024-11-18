package employee_manager;

public class Manager extends Employee {
    private String department;

    public Manager(String name, int age, long salary, String department) {
        super(name, age, salary);
        this.department = department;
    }

    @Override
    public void display_info() {
        super.display_info();
        System.out.println("Department: " + department);
    }
}
