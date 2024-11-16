package employee_manager;

public class Manager extends Employee {
    private String department;

    public Manager(String department) {
        this.department = department;
    }

    @Override
    public void display_info() {
        System.out.println("Department : " + department);
    }

}
