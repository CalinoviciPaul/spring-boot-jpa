package org.irian.springCloud;

import org.irian.springCloud.dao.StoreDao;
import org.irian.springCloud.domain.Product;
import org.irian.springCloud.domain.Store;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by IrianLaptop on 7/3/2016.
 */
@RestController
public class StoreController {

    @Autowired
    StoreDao storeDao;

/*
    @RequestMapping("/stores/{name}")
    public  Store getStore(@PathVariable String name){
        return storeDao.findByName(name);
    }*/

    @RequestMapping("/store")
    public @ResponseBody
    List<Store> getStore(){
        return storeDao.findAll();
    }


    @RequestMapping("/store/{name}")
    public @ResponseBody Store getStoreByName(@PathVariable String name){
        return storeDao.findByName(name);
    }

}
