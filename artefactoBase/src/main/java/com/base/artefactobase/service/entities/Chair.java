package com.base.artefactobase.service.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "chairs", schema = "JWT_SECURITY")
public class Chair implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @JsonIgnore
    @ManyToMany(mappedBy = "chairs")
    private List<Student> students;

}
