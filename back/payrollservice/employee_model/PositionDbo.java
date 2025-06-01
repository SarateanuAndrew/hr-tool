package org.example.payrollservice.employee_model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PositionDbo {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String salaryRange;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private DepartmentDbo department;
}
