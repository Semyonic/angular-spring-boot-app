package com.semihonay.anuglarspringboot.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

/**
 * The type Product model.
 */
@Entity
@Table(name = "Products", schema = "springDB")
@EntityListeners(AuditingEntityListener.class)
@NoArgsConstructor
public class ProductModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    @NotNull
    private String barCode;

    @Getter
    @Setter
    private String productCode;

    @Getter
    @Setter
    @NotNull
    @Column(length = 50)
    private String name;

    @Getter
    @Setter
    @Column(length = 50)
    private String brand;

    @Getter
    @Setter
    private String description;

    @Getter
    @Setter
    @Column(length = 25)
    private BigDecimal price;

    @Getter
    @Setter
    @OneToOne(targetEntity = CategoryModel.class)
    private CategoryModel category;
}
