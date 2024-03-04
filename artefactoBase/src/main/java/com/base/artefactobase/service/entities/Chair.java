package com.base.artefactobase.service.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "chairs", schema = "JWT_SECURITY")
public class Chair implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "chair_seq")
    @SequenceGenerator(name = "chair_seq", sequenceName = "chair_seq", allocationSize = 1)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @JsonIgnore
    @ManyToMany(mappedBy = "chairs")
    private List<Student> students;

}
