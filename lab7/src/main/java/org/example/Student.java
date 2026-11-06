package org.example;

public class Student {
    String name;
    int course;
    String group;

    static int totalStudents = 0;
    static int totalCourses = 0;

    Student(String name, int course, String group) {
        this.name = name;
        this.course = course;
        this.group = group;
        totalStudents++;
        totalCourses += course;
    }

    static void displayInfo(){
        System.out.println("Всего студентов"+totalStudents+"Всего курсов"+totalCourses);
    }

    static double getAverageCourse() {
        if (totalStudents == 0) {
            return 0;
        }
        return (double) totalCourses / totalStudents;
    }

    public static void main(String[] args) {
        new Student("Иван", 1, "ПО-11");
        new Student("Анна", 2, "ПО-21");
        new Student("Максим", 3, "ПО-31");
        new Student("Ольга", 1, "ПО-12");
        new Student("Денис", 4, "ПО-41");
        new Student("Елена", 2, "ПО-22");

        System.out.println("Всего студентов: " + totalStudents);
        System.out.println("Средний курс: " + getAverageCourse());
    }
}