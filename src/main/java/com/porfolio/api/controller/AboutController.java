package com.porfolio.api.controller;

import com.porfolio.api.model.About;
import com.porfolio.api.service.AboutService;
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
@RequestMapping("/about")
public class AboutController {
        
    @Autowired
    private AboutService aboutService;        
    
    @GetMapping("")
    public List<About> getAll() {
        return aboutService.findAll();   
    }
    
    @GetMapping("/{id}")
    public About getOne(@PathVariable Integer id) {
        return aboutService.findById(id);                 
    }
    
    @PostMapping("")
    public About save(@RequestBody About entity) {
        return aboutService.save(entity);        
    }
    
    @PutMapping("/{id}")
    public About update(@PathVariable Integer id, @RequestBody About entity) {
        return aboutService.update(id, entity);  
    }
    
    @DeleteMapping("/{id}")
    public About delete(@PathVariable Integer id) {
        aboutService.delete(id);
        return null;
    }
}