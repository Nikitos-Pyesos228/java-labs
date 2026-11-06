package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Task5 {
    public static void main(String[] args) {
        String fileName = "f.txt";

        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            writer.println(0);
            writer.println(5);
            writer.println(0);
            writer.println(-3);
            writer.println(10);
            writer.println(0);
            writer.println(7);
            writer.println(0);
            writer.println(-1);
            writer.println(4);
        } catch (IOException e) {
            e.printStackTrace();
        }

        int zeroCount = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (Integer.parseInt(line) == 0) {
                    zeroCount++;
                }
            }
            System.out.println("Количество чисел, равных нулю: " + zeroCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}