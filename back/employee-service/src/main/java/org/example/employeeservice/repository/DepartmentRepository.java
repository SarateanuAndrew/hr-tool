package org.example.employeeservice.repository;


import org.example.employeeservice.model.dbo.DepartmentDbo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DepartmentRepository extends JpaRepository<DepartmentDbo, Long> {
//    Page<DepartmentDbo> getAllDepartments(Pageable pageable);
//    Optional<DepartmentDbo> getDepartmentById(Long id);
}
