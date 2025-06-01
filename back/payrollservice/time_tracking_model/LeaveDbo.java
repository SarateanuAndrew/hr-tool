package org.example.payrollservice.time_tracking_model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LeaveDbo {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long employeeId;

    private String type; // e.g., "SICK", "VACATION", "UNPAID"

    private LocalDate startDate;
    private LocalDate endDate;
    private String status; // e.g., "PENDING", "APPROVED", "REJECTED"
}
