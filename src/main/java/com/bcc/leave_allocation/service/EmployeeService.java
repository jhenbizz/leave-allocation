package com.bcc.leave_allocation.service;

import com.bcc.leave_allocation.enums.Position;
import com.bcc.leave_allocation.model.Employee;
import com.bcc.leave_allocation.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public void initializeEmployees() {
        List<Employee> employees = List.of(
                new Employee("Lyman Knox", Position.RANK_AND_FILE),
                new Employee("Brandon Gentry", Position.SUPERVISOR),
                new Employee("Latonya Duncan", Position.MANAGER),
                new Employee("Gail Yoder", Position.RANK_AND_FILE),
                new Employee("Esther Blake", Position.SUPERVISOR),
                new Employee("Blair Franklin", Position.MANAGER),
                new Employee("Numbers Matthews", Position.RANK_AND_FILE),
                new Employee("Denver Morris", Position.SUPERVISOR),
                new Employee("Britt Pierce", Position.MANAGER),
                new Employee("Justine Frederick", Position.RANK_AND_FILE)
        );

        employeeRepository.saveAll(employees);
    }
}
