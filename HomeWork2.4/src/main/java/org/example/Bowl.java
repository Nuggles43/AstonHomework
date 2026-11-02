package org.example;

public class Bowl {
    private  int foodAmount = 0;
    public  int getFoodAmount(){
        return foodAmount;
    };


    public void addFood(int a) {
        if (a>0){
            foodAmount += a;
            System.out.println("В миску добавили: " + a + " еды." + " Теперь в миске: " + foodAmount + " еды.");
        }
    }

    public boolean decreaseFood(int d){
        if (foodAmount >= d) {
        foodAmount -= d;
        return true;
        } else {
            return false;
        }

        }
    }








