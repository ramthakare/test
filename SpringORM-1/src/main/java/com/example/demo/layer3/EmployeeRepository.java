package com.example.demo.layer3;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.layer2.Department;
import com.example.demo.layer2.Employee;

@Repository
public interface EmployeeRepository {
void insertEmployee(Employee empobj); //C
	
	Employee selectEmployee(int eno); //R
	List<Employee> selectEmployees(); //RA
	
	void updateEmployee(Employee empobj); //U
	void deleteEmployee(int eno); //D
}
