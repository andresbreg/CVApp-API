package com.porfolio.api.controller;

import com.porfolio.api.model.Experience;
import com.porfolio.api.service.ExperienceService;
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
@RequestMapping("/experience")
public class ExperienceController {
        
    @Autowired
    private ExperienceService experienceService;        
    
    @GetMapping("")
    public List<Experience> getAll() {
        return experienceService.findAll();   
    }
    
    @GetMapping("/{id}")
    public Experience getOne(@PathVariable Integer id) {
        return experienceService.findById(id);                 
    }
    
    @PostMapping("")
    public Experience save(@RequestBody Experience entity) {
        return experienceService.save(entity);        
    }
    
    @PutMapping("/{id}")
    public Experience update(@PathVariable Integer id, @RequestBody Experience entity) {
        return experienceService.update(id, entity);  
    }
    
    @DeleteMapping("/{id}")
    public Experience delete(@PathVariable Integer id) {
        experienceService.delete(id);
        return null;
    }
}