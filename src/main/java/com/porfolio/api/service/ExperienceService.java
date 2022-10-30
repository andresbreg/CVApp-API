package com.porfolio.api.service;

import com.porfolio.api.model.Experience;
import com.porfolio.api.repository.ExperienceRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ExperienceService implements BaseService<Experience> {
    
    @Autowired
    private ExperienceRepository experienceRepository;
             
    @Override
    @Transactional
    public List<Experience> findAll() {
        List<Experience> entities = experienceRepository.findAll();
        return entities;       
    }

    @Override
    @Transactional
    public Experience findById(Integer id) {
        Optional<Experience> entityOptional = experienceRepository.findById(id);
        return entityOptional.get();        
    }

    @Override
    @Transactional
    public Experience save(Experience entity) {
        return experienceRepository.save(entity);        
    }

    @Override
    @Transactional
    public Experience update(Integer id, Experience entity) {
        Optional<Experience> entityOptional = experienceRepository.findById(id);
        Experience experience = entityOptional.get();
        experience = experienceRepository.save(entity);
        return experience;        
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        experienceRepository.deleteById(id);          
    }        
}