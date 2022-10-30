package com.porfolio.api.service;

import com.porfolio.api.model.Projects;
import com.porfolio.api.repository.ProjectsRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProjectsService implements BaseService<Projects> {
    
    @Autowired
    private ProjectsRepository projectsRepository;
             
    @Override
    @Transactional
    public List<Projects> findAll() {
        List<Projects> entities = projectsRepository.findAll();
        return entities;       
    }

    @Override
    @Transactional
    public Projects findById(Integer id) {
        Optional<Projects> entityOptional = projectsRepository.findById(id);
        return entityOptional.get();        
    }

    @Override
    @Transactional
    public Projects save(Projects entity) {
        return projectsRepository.save(entity);        
    }

    @Override
    @Transactional
    public Projects update(Integer id, Projects entity) {
        Optional<Projects> entityOptional = projectsRepository.findById(id);
        Projects project = entityOptional.get();
        project = projectsRepository.save(entity);
        return project;        
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        projectsRepository.deleteById(id);          
    }
}
