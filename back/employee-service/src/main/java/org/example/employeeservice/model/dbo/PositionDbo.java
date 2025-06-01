package org.example.employeeservice.model.dbo;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PositionDbo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String salaryRange;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private DepartmentDbo department;
}
