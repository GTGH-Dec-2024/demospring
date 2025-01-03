package com.teomaik.demospring.themes;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "themes")
public class Theme {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Or GenerationType.AUTO
    @JsonIgnore
    private Integer id;

    @Column(name = "name", nullable = true)
	private String name;

    @Column(name = "description", nullable = true)
	private String description;

    // Default constructor for JPA
    public Theme() {}
    
    public Theme (String name, String description) {
		this.name = name;
		this.description = description;
	}
    
	public Theme(Integer id, String name, String description) {
		this.id = id;
		this.name = name;
		this.description = description;
	}
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
