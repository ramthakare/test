package com.example.demo.layer3;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.layer2.Department;


@Repository
public interface DepartmentRepository {
  
	void insertDepartment(Department dobj); //C
	
	Department selectDepartment(int dno); //R
	List<Department> selectDepartments(); //RA
	
	void updateDepartment(Department dobj); //U
	void deleteDepartment(int dno); //D
}
