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





   /* public static void productsArray(){
    Product[] productsArray = new Product[5];
    productsArray[0] = new Product("Yamaha p25", LocalDate.of(2014,5,31),"Yamaha corp.", "Japan", 40000);
    productsArray[1] = new Product("Kawaii", LocalDate.of(2012,3,2),"Kawaii corp.", "Japan", 45999);
    productsArray[2] = new Product("Petroff", LocalDate.of(1998,2,15),"Petroff corp.", "Russia", 30000);
    productsArray[3] = new Product("Cassio", LocalDate.of(1998,5,11),"Cassio corp.", "Japan", 60000);
    productsArray[4] = new Product("Steinway", LocalDate.of(1853,7,4),"Steinway & Sons ", "USA", 100000);
        System.out.println(Arrays.toString(productsArray));
}*/



