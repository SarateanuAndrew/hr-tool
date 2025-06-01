package org.example.employeeservice.service;

import org.example.employeeservice.model.dto.request.DepartmentRequestSaveDto;
import org.example.employeeservice.model.dto.response.DepartmentResponseFindDto;

import java.util.List;

public interface DepartmentService {
    List<DepartmentResponseFindDto> getAllDepartments(int page, int size);
    DepartmentResponseFindDto getDepartmentById(Long id);
    void saveDepartment(DepartmentRequestSaveDto departmentRequestSaveDto);
    void deleteDepartmentById(Long id);
}
