package org.example.payrollservice.payrolll_model;

import jakarta.persistence.*;
import lombok.*;


import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PayrollDbo {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long employeeId;

    private LocalDate periodStart;
    private LocalDate periodEnd;
    private BigDecimal grossSalary;
    private BigDecimal netSalary;

    @OneToOne(mappedBy = "payroll", cascade = CascadeType.ALL)
    private PayslipDbo payslip;

    @OneToMany(mappedBy = "payroll", cascade = CascadeType.ALL)
    private List<BonusDbo> bonuses;

    @OneToMany(mappedBy = "payroll", cascade = CascadeType.ALL)
    private List<DeductionDbo> deductions;
}
