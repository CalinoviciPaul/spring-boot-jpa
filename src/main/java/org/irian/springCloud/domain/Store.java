package org.irian.springCloud.domain;

import java.util.Set;

/**
 * Created by IrianLaptop on 7/3/2016.
 */
public class Store {


    private String name;
    private String address;
    private Set<Product> productSet;

    public Store() {
    }

    public Store(String name, String address, Set<Product> productSet) {
        this.name = name;
        this.address = address;
        this.productSet = productSet;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Set<Product> getProductSet() {
        return productSet;
    }

    public void setProductSet(Set<Product> productSet) {
        this.productSet = productSet;
    }
}

