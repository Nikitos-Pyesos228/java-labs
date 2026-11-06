package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        String fileName = "f.txt";
        Scanner scanner = new Scanner(System.in);

        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            System.out.println("Введите 10 целых чисел:");
            for (int i = 0; i < 10; i++) {
                writer.println(scanner.nextInt());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Считанные числа из файла и их сумма:");
        int sum = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                int number = Integer.parseInt(line);
                System.out.print(number + " ");
                sum += number;
            }
            System.out.println("\nСумма всех чисел: " + sum);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}