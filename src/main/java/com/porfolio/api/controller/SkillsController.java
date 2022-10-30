package com.porfolio.api.controller;

import com.porfolio.api.model.Skills;
import com.porfolio.api.service.SkillsService;
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
@RequestMapping("/skills")
public class SkillsController {
        
    @Autowired
    private SkillsService skillsService;        
    
    @GetMapping("")
    public List<Skills> getAll() {
        return skillsService.findAll();   
    }
    
    @GetMapping("/{id}")
    public Skills getOne(@PathVariable Integer id) {
        return skillsService.findById(id);                 
    }
    
    @PostMapping("")
    public Skills save(@RequestBody Skills entity) {
        return skillsService.save(entity);        
    }
    
    @PutMapping("/{id}")
    public Skills update(@PathVariable Integer id, @RequestBody Skills entity) {
        return skillsService.update(id, entity);  
    }
    
    @DeleteMapping("/{id}")
    public Skills delete(@PathVariable Integer id) {
        skillsService.delete(id);
        return null;
    }
}