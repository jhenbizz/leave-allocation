package com.bcc.leave_allocation;

import com.bcc.leave_allocation.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class LeaveAllocationApplication implements CommandLineRunner {

	private final EmployeeService employeeService;


	public static void main(String[] args) {
		SpringApplication.run(LeaveAllocationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		employeeService.initializeEmployees();
	}
}
