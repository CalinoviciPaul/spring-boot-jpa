package org.irian.springCloud.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by IrianLaptop on 7/3/2016.
 */
@Entity
public class Product {


    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String brand;
    private int price;

    private int s;

    public Product() {
    }

    public Product(String name, String brand,int price, int s) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.s = s;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getS() {
        return s;
    }

    public void setS(int s) {
        this.s = s;
    }
}
