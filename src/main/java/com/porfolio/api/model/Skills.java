package com.porfolio.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "skills")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Skills extends Base {
    
    @Column (name = "logo_url")
    private String logoUrl;
    
    @Column (name = "name")
    private String name;  

    @Column (name = "skill_level")
    private String skillLevel;
}