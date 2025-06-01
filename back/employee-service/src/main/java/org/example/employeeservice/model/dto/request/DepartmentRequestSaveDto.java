package org.example.employeeservice.model.dto.request;

import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DepartmentRequestSaveDto {
    private String name;
    private String description;
}
