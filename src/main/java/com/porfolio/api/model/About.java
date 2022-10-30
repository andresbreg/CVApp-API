package com.porfolio.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="about")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class About extends Base {
        
    @Column(name="location")
    private String location;
    
    @Column(name="phone_number")
    private String phoneNumber;
    
    @Column(name="email")
    private String email;   
    
    @Column(name="about")
    private String about;              
}