package oop.members;

public class JobClassCalling {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.name ="Michael";
        employee1.age = 56;
        employee1.phoneNumber ="888888888";
        employee1.address ="First Street";
        employee1.salary = 900;
        employee1.specialization = "Writer";
        employee1.printSalary();


        Manager manager1 = new Manager();
        manager1.name = "Vanesa";
        manager1.age=45;
        manager1.phoneNumber="888888889";
        manager1.address ="Third Street";
        manager1.salary=1700;
        manager1.department = "Public News";
        manager1.printSalary();

    }
}
