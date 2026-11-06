package org.example;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Manager("Алексей", 120000, 6, 8);
        employees[1] = new Manager("Ольга", 140000, 8, 12);
        employees[2] = new Manager("Дмитрий", 110000, 5, 5);
        employees[3] = new Developer("Иван", 90000, 3, "Java");
        employees[4] = new Developer("Максим", 95000, 4, "Java");

        for (Employee emp : employees) {
            emp.displayInfo();
            emp.work();
        }
        Employee employee = new Manager("Алексей", 120000, 6, 8);
        Manager manager1 = new Manager("Алексей", 120000, 6, 8);

        Manager manager = (Manager) employees[0];
        manager.holdMeeting();

        Developer developer = (Developer) employees[3];
        developer.debugCode();
    }
}