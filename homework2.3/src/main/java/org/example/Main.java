package org.example;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Beer", LocalDate.of(2026,7,30),  "Beer Honey Factory Ernst Clein", "Russia", 77);
        System.out.println("Товар: " + product1.name + ", Дата: " + product1.date + ", Производитель: " + product1.importer + ", Страна: " + product1.country + ", Цена: " + product1.price);
    }
}
