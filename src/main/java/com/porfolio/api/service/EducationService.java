package com.porfolio.api.service;

import com.porfolio.api.model.Education;
import com.porfolio.api.repository.EducationRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EducationService implements BaseService<Education> {
    
    @Autowired
    private EducationRepository educationRepository;
             
    @Override
    @Transactional
    public List<Education> findAll() {
        List<Education> entities = educationRepository.findAll();
        return entities;       
    }

    @Override
    @Transactional
    public Education findById(Integer id) {
        Optional<Education> entityOptional = educationRepository.findById(id);
        return entityOptional.get();        
    }

    @Override
    @Transactional
    public Education save(Education entity) {
        return educationRepository.save(entity);        
    }

    @Override
    @Transactional
    public Education update(Integer id, Education entity) {
        Optional<Education> entityOptional = educationRepository.findById(id);
        Education education = entityOptional.get();
        education = educationRepository.save(entity);
        return education;        
    }

    @Override
    @Transactional (readOnly=false)
    public void delete(Integer id) {
        educationRepository.deleteById(id);          
    }    
}