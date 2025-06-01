package org.example.payrollservice.recruitment_model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ApplicantDbo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String phone;
    private String resumeUrl; // URL to the uploaded resume
    private Long appliedPositionId; // Reference to the job posting (JobPosting service)

    private String status; // e.g., "APPLIED", "INTERVIEWED", "HIRED", "REJECTED"
}
