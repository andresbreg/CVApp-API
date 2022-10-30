package com.porfolio.api.controller;

import com.porfolio.api.model.Projects;
import com.porfolio.api.service.ProjectsService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/projects")
public class ProjectsController {
        
    @Autowired
    private ProjectsService projectsService;        
    
    @GetMapping("")
    public List<Projects> getAll() {
        return projectsService.findAll();   
    }
    
    @GetMapping("/{id}")
    public Projects getOne(@PathVariable Integer id) {
        return projectsService.findById(id);                 
    }
    
    @PostMapping("")
    public Projects save(@RequestBody Projects entity) {
        return projectsService.save(entity);        
    }
    
    @PutMapping("/{id}")
    public Projects update(@PathVariable Integer id, @RequestBody Projects entity) {
        return projectsService.update(id, entity);  
    }
    
    @DeleteMapping("/{id}")
    public Projects delete(@PathVariable Integer id) {
        projectsService.delete(id);
        return null;
    }
}