package org.irian.springCloud.dao;

import org.irian.springCloud.domain.Store;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by IrianLaptop on 7/3/2016.
 */
public interface StoreDao extends CrudRepository<Store,Long> {
    List<Store> findAll();
    Store findByName(String name);
}
