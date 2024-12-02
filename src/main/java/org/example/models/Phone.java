package ee.ivkhkdev.models;

import java.io.*;
import java.util.List;

public class Phone  {
    private static long count = 1;
    private Long id;
    private Manufacturer manufacturer;
    private String name;
    private int year;
    private String color;
    private double price;
    private int quantity;

    public Phone() {
        this.id = this.count++;
    }

    public Phone(Manufacturer manufacturer, String name, int year, String color, double price, int quantity) {
        this.id = Phone.count++;
        this.manufacturer = manufacturer;
        this.name = name;
        this.year = year;
        this.color = color;
        this.price = price;
        this.quantity = quantity;
    }


    @Override
    public String toString() {
        return String.format("ID: %d, Производитель: %s (%s), Название: %s, Год: %d, Цвет: %s, Цена: $%.2f, Количество: %d",
                id, manufacturer.getName(), manufacturer.getCountry(), name, year, color, price, quantity);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
