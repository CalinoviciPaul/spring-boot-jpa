package org.irian.springCloud.dao;

import org.irian.springCloud.domain.Store;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

/**
 * Created by IrianLaptop on 7/3/2016.
 */

/**
 * Spring data dynamically implements repositories and handles
 * data management and transaction management
 */
@RestResource(path = "stores", rel = "stores")
public interface StoreDao extends CrudRepository<Store,Long> {
    List<Store> findAll();
    Store findByName(String name);
}
