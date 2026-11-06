package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        String fileName = "wind.txt";
        Scanner scanner = new Scanner(System.in);

        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            System.out.println("Введите 10 значений скорости ветра:");
            for (int i = 0; i < 10; i++) {
                writer.println(scanner.nextDouble());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        double sum = 0;
        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                sum += Double.parseDouble(line);
                count++;
            }
            if (count > 0) {
                System.out.println("Средняя скорость ветра: " + (sum / count));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}