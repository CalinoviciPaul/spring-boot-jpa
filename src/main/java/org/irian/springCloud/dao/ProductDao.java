package org.irian.springCloud.dao;

import org.irian.springCloud.domain.Product;
import org.irian.springCloud.domain.Store;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

/**
 * Created by IrianLaptop on 7/3/2016.
 */
@RestResource(path = "products", rel = "products", exported = false)
public interface ProductDao extends CrudRepository<Product,Long> {
    List<Product> findAll();
    Store findByName(String name);
}
