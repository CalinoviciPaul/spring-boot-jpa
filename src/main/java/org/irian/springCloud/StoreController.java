package org.irian.springCloud;

import org.irian.springCloud.domain.Product;
import org.irian.springCloud.domain.Store;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by IrianLaptop on 7/3/2016.
 */
@RestController
public class StoreController {

    private Store store;


    @PostConstruct
    public void init(){
        Set<Product> productSet = new HashSet<>();
        productSet.add(new Product("Product1","Brand1",2));
        productSet.add(new Product("Product2","Brand2",3));
        store = new Store("Store1","Address1",productSet);
    }

    @RequestMapping("/store")
    public  Store getStore(){
        return this.store;
    }
}
