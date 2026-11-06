public class Report {
    public static void generateReport(Employee[] employees) {
        System.out.println("==================================");
        System.out.printf("%-15s | %12s%n", "Сотрудник", "Зарплата");
        System.out.println("----------------------------------");

        for (Employee emp : employees) {
            System.out.printf("%-15.15s | %12.2f%n", emp.getFullname(), emp.getSalary());
        }
        System.out.println("==================================");
    }
}