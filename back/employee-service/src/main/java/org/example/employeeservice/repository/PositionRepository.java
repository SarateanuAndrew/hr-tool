package org.example.employeeservice.repository;

import org.example.employeeservice.model.dbo.PositionDbo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PositionRepository  extends JpaRepository<Long, PositionDbo> {
}
