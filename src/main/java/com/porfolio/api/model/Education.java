package com.porfolio.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "education")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Education extends Base {
    
    @Column (name = "logo_url")
    private String logoUrl;
    
    @Column (name = "start_date")
    private String startDate;
    
    @Column (name = "end_date")
    private String endDate;
    
    @Column (name = "name")
    private String name;  

    @Column(name="course")
    private String course;      
}