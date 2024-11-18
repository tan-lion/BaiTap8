package employee_manager;

import java.util.Map;

public class Main {
    public static void main(String[] args) {

        //Declare, Input
        Employee employee = new Employee("Ao Nhat Tan", 24, 15000000);
        Employee manager = new Manager("Ao Nhat Tann", 25, 20000000, "01");

        employee.display_info();
        System.out.println("---------------");
        manager.display_info();

    }
}
