package org.example;

public class Cat extends Animal {
    private static int catCount = 0;
    private int hungry;
    private boolean full;

    public Cat(String name, int hungry) {
        super(name);
        catCount++;
        this.hungry = hungry;
        this.full = false;
    }

    public static int getCatCount() {
        return catCount;
    }

    @Override
    public void run(int d) {
        if (d > 0 & d < 200) {
            System.out.println(getName() + " пробежал: " + d + " метров.");
        } else {
            System.out.println(getName() + " не может пробежать: " + d + " метров");
        }
    }

    @Override
    public void swim(int d) {
        System.out.println(getName() + " не умеет плавать.");
    }

    public void eat( Bowl bowl) {
        boolean isEaten = bowl.decreaseFood(hungry);
        if (isEaten) {
            full = true;
            System.out.println(getName() + " съел из миски: " + hungry + " еды. " + getName() + " сыт. ");
        } else {
            System.out.println(getName() + " хотел съесть " + hungry + " еды, но в миске недостаточно еды (" + bowl.getFoodAmount() + ")." + getName() + " остался голодным.");
        }


    }


}


/*public void catEat(int f) {



if (foodCount < f) {

System.out.println(getName() + " пытается съесть: " + f + " еды. " + "В миске нет столько еды." + getName() + " остался голодный " + fullStomach);

} else {

foodCount -= f;

System.out.println(getName() + " съел: " + f + " еды, " + "теперь в миске: " + foodCount + " еды");

fullStomach = true;

System.out.println(getName() + " сыт." + fullStomach);

}

}*/

