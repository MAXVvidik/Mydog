package org.example;

import java.util.Scanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); // Используем локализацию с точкой для дробных чисел

        List<Dog> dogList = new ArrayList<>(); // Список для хранения созданных собак
        boolean continueCreating = true;

        while (continueCreating) {
            // Запрашиваем у пользователя данные о собаке
            System.out.print("Введите имя собаки: ");
            String name = scanner.nextLine();

            System.out.print("Введите породу собаки: ");
            String breed = scanner.nextLine();

            System.out.print("Введите вес собаки (в кг): ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Пожалуйста, введите правильное число с точкой.");
                scanner.next(); // пропускаем некорректный ввод
            }
            double weight = scanner.nextDouble();

            System.out.print("Введите рост собаки (в см): ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Пожалуйста, введите правильное число с точкой.");
                scanner.next(); // пропускаем некорректный ввод
            }
            double height = scanner.nextDouble();

            System.out.print("Введите возраст собаки: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Пожалуйста, введите правильное число с точкой.");
                scanner.next(); // пропускаем некорректный ввод
            }
            double age = scanner.nextDouble();

            scanner.nextLine(); // очистка буфера после ввода чисел

            System.out.print("Введите цвет собаки: ");
            String color = scanner.nextLine();

            System.out.print("Введите клеймо собаки: ");
            String tattoo = scanner.nextLine();

            // Создаем объект Dog
            Dog dog = new Dog(name, breed, weight, height, color, age, tattoo);

            // Добавляем собаку в список
            dogList.add(dog);

            System.out.println("Собака успешно создана и сохранена:");
            System.out.println(dog);

            // Спрашиваем пользователя, хочет ли он создать еще одну собаку
            System.out.print("Хотите создать еще одну собаку? (да/нет): ");
            String answer = scanner.nextLine();

            if (answer.equalsIgnoreCase("нет")) {
                continueCreating = false;
            }
        }

        // Выводим список всех созданных собак
        System.out.println("\nСписок всех созданных собак:");
        for (Dog savedDog : dogList) {
            System.out.println(savedDog);
        }

        scanner.close(); // закрываем сканер
    }
}



