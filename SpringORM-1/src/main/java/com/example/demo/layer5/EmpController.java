package com.example.demo.layer5;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.layer2.Employee;
import com.example.demo.layer3.EmployeeRepositoryImp;



@RestController
@RequestMapping("/emp")

public class EmpController {


		@Autowired 
		EmployeeRepositoryImp empRepo;

		
		@RequestMapping("/hi")
		public String greet() {
			return "hello";
		}
//		@GetMapping(produces =  MediaType.APPLICATION_JSON_VALUE)
		@RequestMapping("/get/{eno}")
		public Employee getDept(@PathVariable("eno") int x)
		{
			Employee emp = null;
			emp=empRepo.selectEmployee(x);
			
			System.out.println("controller : dept : "+emp.getEmpno());
			return emp;
		}
		
//		@GetMapping(produces =  MediaType.APPLICATION_JSON_VALUE)
		@RequestMapping("/getAll")
		public List<Employee> getEmps()
		{
			System.out.println("getAll");
			List<Employee> empList;
			empList=empRepo.selectEmployees();
			return empList;
		}
		 @PostMapping("/add")//localhost:8080/dept/add
		 public void addEmp(@RequestBody Employee empObj)
		 {
			 empRepo.insertEmployee(empObj);
			 
		 }
		 @PutMapping("/update")
		 public void updateEmp(@RequestBody Employee empObj)
		 {
			 empRepo.updateEmployee(empObj);
		 }
		 
		 @DeleteMapping("/delete/dno")
		 public void deleteDept(@PathVariable("eno")int x)
		 {
			 empRepo.deleteEmployee(x);
		 }
}
