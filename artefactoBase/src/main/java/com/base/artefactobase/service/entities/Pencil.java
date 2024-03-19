package com.base.artefactobase.service.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "PENCILS", schema = "JWT_SECURITY")
public class Pencil {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "usr_seq")
    @SequenceGenerator(name = "usr_seq", sequenceName = "usr_seq", allocationSize = 1)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

}
