package com.inditex.test.inditex.infrastructure.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "brands")
@Data
public class BrandEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(max = 75)
    @Column(name = "name")
    private String name;

    @NotBlank
    @Size(max = 150)
    @Column(name = "address")
    private String address;

    @OneToMany(mappedBy = "brand", cascade = CascadeType.ALL)
    private List<PriceEntity> prices;
}
