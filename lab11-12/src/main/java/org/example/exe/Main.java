package org.example.exe;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Animal> animals = new HashMap<>();

        animals.put("Бобик", new Dog("Бобик", 1, 3, "Овчарка"));
        animals.put("Шарик", new Dog("Шарик", 2, 5, "Такса"));
        animals.put("Рекс", new Dog("Рекс", 3, 4, "Доберман"));

        animals.put("Мурка", new Cat("Мурка", 4, 2, "Белый"));
        animals.put("Барсик", new Cat("Барсик", 5, 4, "Рыжий"));
        animals.put("Пушок", new Cat("Пушок", 6, 1, "Черный"));

        animals.put("Кеша", new Bird("Кеша", 7, 1, 0.25));
        animals.put("Чижик", new Bird("Чижик", 8, 2, 0.15));

        for (Map.Entry<String, Animal> entry : animals.entrySet()) {
            System.out.println("Ключ (Имя): " + entry.getKey() + " | Значение: " + entry.getValue());
        }

        Iterator<Map.Entry<String,Animal>> iterator = animals.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String,Animal> entry = iterator.next();
            System.out.println("Ключ Имя:"+ entry.getKey()+"Значение: "+entry.getValue());
        }
        }
    }































