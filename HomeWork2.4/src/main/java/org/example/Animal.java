package org.example;

public abstract class Animal {
    private String name;
    private static int animalCount = 0;

    public static int getAnimalCount() {
        return animalCount;
    }
    public String getName () {
        return name;
    }

    public Animal (String name) {
        animalCount ++;
        this.name = name;
    }
    public void run (int d) {
        System.out.println(name + " пробежал: " + d + " метров.");
    }
    public abstract void swim (int d) ;
}
