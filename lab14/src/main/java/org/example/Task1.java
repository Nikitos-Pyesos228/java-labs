package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Task1 {
    public static void main(String[] args) {
        String fileName = "specialty.txt";

        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            writer.println("Специальность: Разработка и сопровождение ПО информационных систем");
            writer.println("Квалификация: Техник-программист");
        } catch (IOException e) {
            e.printStackTrace();
        }

        java.io.File file = new java.io.File(fileName);
        System.out.println("Имя файла: " + file.getName());
        System.out.println("Путь: " + file.getAbsolutePath());
        System.out.println("Размер: " + file.length() + " байт");
        System.out.println("Существует: " + file.exists());
        System.out.println("--------------------");

        System.out.println("Содержимое файла:");
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
