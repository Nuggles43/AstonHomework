package org.example;

public class Dog extends Animal {
    private static int dogCount = 0;
    public Dog(String name) {
        super(name);
        dogCount++;
    }
    public static int getDogCount() {
        return dogCount;
    }

    @Override
    public void run(int d) {
        if (d>0 & d<500) {
            System.out.println(getName() + " пробежал: " + d + " метров.");
        } else {
            System.out.println(getName() + " не может пробежать: " + d + " метров");
        }
    }

    @Override
    public void swim(int d) {
        if (d>0 & d<10) {
            System.out.println(getName() + " проплыл: " + d + " метров");
        } else {
            System.out.println(getName() + " не может проплыть: " + d + " метров");
        }
    }
}


