package employee_manager;

import java.util.Map;

public class Main {
    public static void main(String[] args) {

        //Declare, Input
        Employee employee=new Employee("Ao Nhat Tan", 24, 100000000);
        Employee employee_1=new Employee("Ao Nhat Tann", 25, 150000000);
        Employee employee_2=new Employee("Ao Nhat Tannn", 26, 200000000);

        Manager manager = new Manager("Room 1");
        Manager manager_1 = new Manager("Room 2");
        Manager manager_2 = new Manager("Room 3");

        //Ouput
        //Room 1
        manager.display_info();
        employee.display_info();
        //Room 2
        manager_1.display_info();
        employee_2.display_info();
        //Room 3
        manager_2.display_info();
        employee_2.display_info();


    }
}
