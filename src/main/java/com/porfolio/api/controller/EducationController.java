package com.porfolio.api.controller;

import com.porfolio.api.model.Education;
import com.porfolio.api.service.EducationService;
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
@RequestMapping("/education")
public class EducationController {
        
    @Autowired
    private EducationService educationService;        
    
    @GetMapping("")
    public List<Education> getAll() {
        return educationService.findAll();   
    }
    
    @GetMapping("/{id}")
    public Education getOne(@PathVariable Integer id) {
        return educationService.findById(id);                 
    }
    
    @PostMapping("")
    public Education save(@RequestBody Education entity) {
        return educationService.save(entity);        
    }
    
    @PutMapping("/{id}")
    public Education update(@PathVariable Integer id, @RequestBody Education entity) {
        return educationService.update(id, entity);  
    }
    
    @DeleteMapping("/{id}")
    public Education delete(@PathVariable Integer id) {
        educationService.delete(id);
        return null;
    }
}