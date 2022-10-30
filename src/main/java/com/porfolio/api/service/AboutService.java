package com.porfolio.api.service;

import com.porfolio.api.model.About;
import com.porfolio.api.repository.AboutRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AboutService implements BaseService<About> {
    
    @Autowired
    private AboutRepository aboutRepository;
             
    @Override
    @Transactional
    public List<About> findAll() {
        List<About> entities = aboutRepository.findAll();
        return entities;       
    }

    @Override
    @Transactional
    public About findById(Integer id) {
        Optional<About> entityOptional = aboutRepository.findById(id);
        return entityOptional.get();        
    }

    @Override
    @Transactional
    public About save(About entity) {
        return aboutRepository.save(entity);        
    }

    @Override
    @Transactional
    public About update(Integer id, About entity) {
        Optional<About> entityOptional = aboutRepository.findById(id);
        About about = entityOptional.get();
        about = aboutRepository.save(entity);
        return about;        
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        aboutRepository.deleteById(id);          
    }        
}