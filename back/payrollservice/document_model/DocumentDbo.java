package org.example.payrollservice.document_model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDate;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DocumentDbo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;       // Name of the document (e.g., "contract_123.pdf")
    private String type;       // Type of document (e.g., "CONTRACT", "PAYSILP", etc.)
    private Long employeeId;   // Reference to the employee this document is associated with (no JPA relation)

    private LocalDate uploadDate;
    private String fileUrl;    // URL where the document is stored (e.g., in cloud storage)
    private String tags;       // Tags or keywords associated with the document (optional, for search)

}
