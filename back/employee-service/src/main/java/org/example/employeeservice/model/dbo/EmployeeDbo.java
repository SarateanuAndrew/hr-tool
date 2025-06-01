package org.example.employeeservice.model.dbo;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Builder
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class EmployeeDbo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String email;
    private String phone;
    private LocalDate dob;
    private String gender;
    private String address;
    private LocalDate hireDate;
    private String status;
    @ManyToOne
    @JoinColumn(name = "position_id")
    private PositionDbo position;
    @ManyToOne
    @JoinColumn(name = "department_id")
    private DepartmentDbo department;
}
