package com.hungrycoder.spring.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Role {
  @Id
  @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
  private Long id;

  private EmployeeRole name;

  public Role() {

  }

  public Role(EmployeeRole name) {
    this.name = name;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public EmployeeRole getName() {
    return name;
  }

  public void setName(EmployeeRole name) {
    this.name = name;
  }
}
