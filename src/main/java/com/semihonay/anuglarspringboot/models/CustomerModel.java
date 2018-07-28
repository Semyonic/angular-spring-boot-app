package com.semihonay.anuglarspringboot.models;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

/**
 * The type Customer model.
 */
@Entity
@Table(name = "Customers", schema = "springDB")
@EntityListeners(AuditingEntityListener.class)
@NoArgsConstructor
public class CustomerModel {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Getter
  @Setter
  private Long id;

  @Getter
  @Setter
  @NotNull
  private String name;

  @Getter
  @Setter
  @NotNull
  private String mail;

  @Getter
  @Setter
  private String gender;

  @Getter
  @Setter
  private Integer age;

  @Getter
  @Setter
  private Date dateOfBirth;

  @Getter
  @Setter
  @Column(nullable = false, updatable = false)
  @Temporal(TemporalType.DATE)
  @CreatedDate
  private Date createdAt;

  @Getter
  @Setter
  @Column(nullable = false, updatable = true)
  @Temporal(TemporalType.DATE)
  @LastModifiedDate
  private Date updatedAt;
}
