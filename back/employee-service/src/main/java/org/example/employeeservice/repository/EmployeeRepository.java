package org.example.employeeservice.repository;

import org.example.employeeservice.model.dbo.EmployeeDbo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Long, EmployeeDbo> {
}
