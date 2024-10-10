package org.example;
public class Dog {
    private String name;
    private String breed;
    private double weight;
    private double height;
    private String color;
    private double age;
    private String tattoo; // Клеймо

    // Конструктор
    public Dog(String name, String breed, double weight, double height, String color, double age, String tattoo) {
        this.name = name;
        this.breed = breed;
        this.weight = weight;
        this.height = height;
        this.color = color;
        this.age = age;
        this.tattoo = tattoo;
    }

    // Геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTattoo() {
        return tattoo;
    }

    public void setTattoo(String tattoo) {
        this.tattoo = tattoo;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", tattoo='" + tattoo + '\'' +
                '}';
    }
}

