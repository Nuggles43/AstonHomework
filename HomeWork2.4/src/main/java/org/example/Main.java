package org.example;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Барсик", 20);
        Dog dog = new Dog ("Барбос");
        Bowl bowl = new Bowl();
        Cat[] cats = {
                new Cat("Барсик", 20),
                new Cat("Бибоп", 30),
                new Cat("Абобус", 5)
        };

        System.out.println("Тест собак");
        dog.run(450);
        dog.run(500);
        dog.swim(4);
        dog.swim(34);

        System.out.println("\nТест кота");

        cat.run(190);
        cat.run(1000);
        cat.swim(2);

        System.out.println("\nТест кормления котов");

        bowl.addFood(30);
        for (Cat allCats : cats) {
            allCats.eat(bowl);
        }

        System.out.println("\nСтатистика");

        System.out.println("Создано котов: " + Cat.getCatCount());
        System.out.println("Создано собак: " + Dog.getDogCount());
        System.out.println("Всего животных: " + Animal.getAnimalCount());

    }
}
