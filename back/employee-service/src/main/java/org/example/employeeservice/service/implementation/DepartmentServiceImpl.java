package org.example.employeeservice.service.implementation;

import lombok.AllArgsConstructor;
import org.example.employeeservice.model.dbo.DepartmentDbo;
import org.example.employeeservice.model.dto.request.DepartmentRequestSaveDto;
import org.example.employeeservice.model.dto.response.DepartmentResponseFindDto;
import org.example.employeeservice.repository.DepartmentRepository;
import org.example.employeeservice.service.DepartmentService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {
    private final DepartmentRepository departmentRepository;

    @Override
    public List<DepartmentResponseFindDto> getAllDepartments(int page, int size) {
        Page<DepartmentDbo> allDepartments = departmentRepository.getAllDepartments(PageRequest.of(page, size));
        if (allDepartments.hasContent()) {
            return allDepartments.stream()
                    .map(departmentDbo -> DepartmentResponseFindDto.builder()
                            .name(departmentDbo.getName())
                            .description(departmentDbo.getDescription())
                            .build())
                    .toList();
        }
        return null;
    }

    @Override
    public DepartmentResponseFindDto getDepartmentById(Long id) {
        Optional<DepartmentDbo> departmentById = departmentRepository.getDepartmentById(id);
        return null;
    }

    @Override
    public void saveDepartment(DepartmentRequestSaveDto departmentRequestSaveDto) {

    }

    @Override
    public void deleteDepartmentById(Long id) {

    }
}