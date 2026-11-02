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


/*if (foodCount < 10) {
        System.out.println("В миске мало еды, " + Cat.getName() + " прошел мимо миски.");
        } else if (foodCount < e) {
        System.out.println(getName() + " пытается съесть: " + e + " еды. " + "В миске нет столько еды." + getName() + " остался голодный " + fullStomach);
        } else {
foodCount -= e;
            System.out.println(getName() + " съел: " + e + " еды, " + "теперь в миске: " + foodCount + " еды");
fullStomach = true;
        System.out.println(getName() + " сыт." + fullStomach);
        }
        }*/