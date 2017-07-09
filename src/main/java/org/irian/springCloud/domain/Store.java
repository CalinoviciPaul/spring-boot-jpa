package org.irian.springCloud.domain;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Set;

/**
 * Created by IrianLaptop on 7/3/2016.
 */
@Entity
public class Store {


    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String address;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "store_id")
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


