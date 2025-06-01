package org.example.payrollservice.payrolll_model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DeductionDbo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String type;
    private BigDecimal amount;
    private String reason;

    @ManyToOne
    @JoinColumn(name = "payroll_id")
    private PayrollDbo payroll;
}
