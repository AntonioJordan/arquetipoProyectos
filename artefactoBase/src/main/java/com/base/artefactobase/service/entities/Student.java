package com.base.artefactobase.service.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "students", schema = "JWT_SECURITY")
public class Student implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_seq")
    @SequenceGenerator(name = "student_seq", sequenceName = "student_seq", allocationSize = 1)
    @Column(name = "ID")
    private Long id;

    @Column(name = "STUDENT")
    private String name;

    @JsonIgnore
    @ManyToMany
    @JoinTable(
            name = "students_chairs",
            schema = "JWT_SECURITY",
            joinColumns = @JoinColumn(name = "STUDENT_ID"),
            inverseJoinColumns = @JoinColumn(name = "CHAIR_ID")
    )
    private List<Chair> chairs;

}
