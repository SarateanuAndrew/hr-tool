package org.example.employeeservice.model.dto.response;

import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DepartmentResponseFindDto {
    private String name;
    private String description;
}
