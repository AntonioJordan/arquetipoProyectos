package com.inditex.test.inditex.infrastructure.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "prices")
@Data
public class PriceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "start_date")
    private LocalDateTime startDate;

    @NotNull
    @Column(name = "end_date")
    private LocalDateTime endDate;

    @NotNull
    @Column(name = "price_list")
    private Integer priceList;

    @NotNull
    @Column(name = "priority")
    private Integer priority;

    @NotNull
    @Column(name = "amount")
    private BigDecimal amount;

    @NotNull
    @Column(name = "curr")
    private String currency;

    @ManyToOne
    @JoinColumn(name = "brand_id")
    private BrandEntity brand;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private ProductEntity product;
}
