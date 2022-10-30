package com.porfolio.api.service;

import com.porfolio.api.model.Skills;
import com.porfolio.api.repository.SkillsRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SkillsService implements BaseService<Skills> {
    
    @Autowired
    private SkillsRepository skillsRepository;
             
    @Override
    @Transactional
    public List<Skills> findAll() {
        List<Skills> entities = skillsRepository.findAll();
        return entities;       
    }

    @Override
    @Transactional
    public Skills findById(Integer id) {
        Optional<Skills> entityOptional = skillsRepository.findById(id);
        return entityOptional.get();        
    }

    @Override
    @Transactional
    public Skills save(Skills entity) {
        return skillsRepository.save(entity);        
    }

    @Override
    @Transactional
    public Skills update(Integer id, Skills entity) {
        Optional<Skills> entityOptional = skillsRepository.findById(id);
        Skills skill = entityOptional.get();
        skill = skillsRepository.save(entity);
        return skill;        
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        skillsRepository.deleteById(id);          
    }        
}