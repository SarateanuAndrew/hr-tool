package org.example.payrollservice.recruitment_model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class InterviewDbo {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long applicantId; // Just a reference to the Applicant, no direct JPA relation

    private Long interviewerId; // Reference to the person conducting the interview, likely from the Employee Service
    private LocalDateTime dateTime;
    private String feedback; // e.g., "Good candidate", "Needs improvement"
    private String result; // e.g., "PASSED", "FAILED", "PENDING"
}
