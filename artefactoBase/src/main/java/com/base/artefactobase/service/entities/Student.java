package com.base.artefactobase.service.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "students", schema = "JWT_SECURITY")
public class Student implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "STUDENT")
    private String name;

    @JsonIgnore
    @ManyToMany
    @JoinTable(
            name = "students_chairs",
            joinColumns = @JoinColumn(name = "CHAIR_ID"),
            inverseJoinColumns = @JoinColumn(name = "STUDENT_ID")
    )
    private List<Chair> chairs;

}
