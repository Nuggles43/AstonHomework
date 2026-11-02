package org.example;
import java.time.LocalDate;

public  class Product {
        String name;
        LocalDate date;
        String importer;
        String country;
        int price;
        public Product (String name, LocalDate date, String importer, String country, int price) {
            this.name = name;
            this.date = date;
            this.importer = importer;
            this.country = country;
            this.price = price;
        }


    @Override
    public String toString() {
        return  "\n" + "Название: " + name + "\n" + "Цена: " + price + "руб." + "\n"  +  "Производитель: " + importer + "\n" + "Страна: " + country + " \n"  + "Дата производства: " + date + "\n" ;
    }
}









