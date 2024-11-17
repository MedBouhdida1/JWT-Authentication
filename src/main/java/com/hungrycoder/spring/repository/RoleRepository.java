package com.hungrycoder.spring.repository;

import java.util.Optional; // Import Optional for handling optional values

import com.hungrycoder.spring.models.EmployeeRole; // Import EmployeeRole enumeration
import com.hungrycoder.spring.models.Role; // Import Role model
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository interface for accessing Role entities in the MongoDB database.
 * It extends MongoRepository, providing CRUD operations for Role objects.
 */
public interface RoleRepository extends JpaRepository<Role, Id> {

  /**
   * Find a Role by its name.
   *
   * @param name The name of the role represented as an EmployeeRole enum.
   * @return An Optional containing the Role if found, or empty if not found.
   */
  Optional<Role> findByName(EmployeeRole name);
}
