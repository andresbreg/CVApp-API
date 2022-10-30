package com.porfolio.api.service;

import com.porfolio.api.model.About;
import java.util.List;

public interface BaseService<E> {
    public List<E> findAll();
    public E findById(Integer id);
    public E save(E entity);
    public E update(Integer id, E entity);
    public void delete(Integer id);    
}