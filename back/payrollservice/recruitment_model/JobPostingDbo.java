package org.example.payrollservice.recruitment_model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class JobPostingDbo {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private Long departmentId; // Just a reference to the department, no relation to Department service

    private LocalDate postedDate;
    private String status; // e.g., "OPEN", "CLOSED", "ON_HOLD"
}
