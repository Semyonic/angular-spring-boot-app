package com.semihonay.anuglarspringboot.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

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
    @Column(length = 350)
    private String barCode;

    @Getter
    @Setter
    @NotNull
    @Column(length = 350)
    private String productCode;

    @Getter
    @Setter
    @NotNull
    @Column(length = 350)
    private String name;

    @Getter
    @Setter
    @NotNull
    @Column(length = 350)
    private String brand;

    @Getter
    @Setter
    @NotNull
    @Column(length = 350)
    private String description;

    @Getter
    @Setter
    @NotNull
    @Column(length = 350)
    private String productImg;

    @Getter
    @Setter
    @NotNull
    @Column(length = 350)
    private String price;

    @Getter
    @Setter
    @NotNull
    @OneToOne(targetEntity = CategoryModel.class)
    private CategoryModel category;
}
