package com.anu.usermanagement.core.dao;

import org.hibernate.criterion.Criterion;

import java.io.Serializable;
import java.util.List;

public interface AbstractDao<E, I extends Serializable> {

    E findById(I id);
    void saveOrUpdate(E e);
    void delete(E e);
    List<E> findAll();
    List<E> findByCriteria(Criterion criterion);
    
    //public void deleteByID(final int entityId);
}
