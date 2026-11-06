package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        String f = "f.txt";
        String g = "g.txt";
        String h = "h.txt";
        Random random = new Random();

        try (PrintWriter writerF = new PrintWriter(new FileWriter(f))) {
            for (int i = 0; i < 20; i++) {
                writerF.println(random.nextInt(100) + 1);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(f));
             PrintWriter writerG = new PrintWriter(new FileWriter(g));
             PrintWriter writerH = new PrintWriter(new FileWriter(h))) {

            String line;
            while ((line = reader.readLine()) != null) {
                int num = Integer.parseInt(line);
                if (num > 50) {
                    writerG.println(num);
                } else {
                    writerH.println(num);
                }
            }
            System.out.println("Файлы 'g' и 'h' успешно сформированы.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}