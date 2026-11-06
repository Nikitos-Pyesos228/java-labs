package org.example;

public class Main3 {
    public static void main(String[] args) {
        Person man = new Person("Иван", Gender.MALE);
        Person woman = new Person("Анна", Gender.FEMALE);

        System.out.println("Имя: " + man.getName() + ", Пол: " + man.getGender());
        System.out.println("Имя: " + woman.getName() + ", Пол: " + woman.getGender());
        System.out.println(man);
    }
}
