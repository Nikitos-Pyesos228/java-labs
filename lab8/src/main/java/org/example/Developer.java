package org.example;

public class Developer extends Employee {
    private String language;

    public Developer(String name, double salary, int experience, String language) {
        super(name, salary, experience);
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public void work() {
        System.out.println("Пишет код на Java");
    }

    public void debugCode() {
        System.out.println("Разработчик " + getName() + " ищет и исправляет ошибки в коде");
    }
}