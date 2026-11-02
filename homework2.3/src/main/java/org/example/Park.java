package org.example;

public  class Park {
    public  class Attraction {
        String name;
        String time;
        int price;

        public Attraction(String name, String time, int price) {
            this.name = name;
            this.time = time;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Аттракцион: " + name + " | Время: " + time + " | Цена: " + price + " руб.";
        }
    }

    Attraction [] attractions;
    public Park(){
        attractions = new Attraction[2];
        attractions[0] = new Attraction("Колесо обозрения", "10:00 - 20:00", 600);
        attractions[1] = new Attraction("Американские горки", "12:00 - 22:00", 700);
    }

    public void showAttractions() {
        for (Attraction a : attractions) {
            System.out.println(a);
        }
    }
}

