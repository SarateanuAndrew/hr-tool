package org.example.payrollservice.payrolll_model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PayslipDbo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fileUrl;

    @OneToOne
    @JoinColumn(name = "payroll_id")
    private PayrollDbo payroll;
}
