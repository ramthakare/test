package com.example.demo.layer3;

import java.util.ArrayList;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.layer2.Department;
import com.example.demo.layer2.Employee;

@Repository
public class EmployeeRepositoryImp extends BaseRepository implements EmployeeRepository{
	public EmployeeRepositoryImp() {
	System.out.println("EmployeeRepositoryImp ..");	
}
	
	@Transactional
	public void insertEmployee(Employee empobj)
	{
		
		super.persist(empobj); // invoking the dummy persist of the super class
		System.out.println("Employee inserted...");
	}

	@Transactional
	public Employee selectEmployee(int eno) 
	{
		
		System.out.println("EmployeeRepositoryImpl : selecting employee by empno");
		Employee emp = super.find(Employee.class, eno);
		System.out.println("repo : dept "+emp);
		System.out.println("emp "+emp.getEmpno());
		System.out.println("emp "+emp.getEname());
		System.out.println("emp "+emp.getJob());
		System.out.println("emp "+emp.getMgr());
		System.out.println("emp "+emp.getSalary());
		System.out.println("emp "+emp.getComm());
		
		
		
		return emp;
		
	}

	@Transactional
	public List<Employee> selectEmployees() 
	{
		
		List<Employee>  empList = new ArrayList<Employee>();

		System.out.println("EmployeeRepositoryImpl : Selecting all employees...");
		empList =  super.findAll("Employee");
		System.out.println("repo : empList ref  "+empList);
		System.out.println("repo : emptList size "+empList.size());

		for(Employee emp : empList) {
			
			System.out.println("emp "+emp.getEmpno());
			System.out.println("emp "+emp.getEname());
			System.out.println("emp "+emp.getJob());
			System.out.println("emp "+emp.getMgr());
			System.out.println("emp "+emp.getSalary());
			System.out.println("emp "+emp.getComm());
			
			System.out.println("emp "+emp.getDate());

		}
		return empList;
		
	}
	@Transactional
	
	public void updateEmployee(Employee empobj) {
		// TODO Auto-generated method stub
		System.out.println("EmployeeRepositoryImpl : Updating Employee...");
		super.merge(empobj);
	}
	@Transactional
	
	public void deleteEmployee(int eno) {
		// TODO Auto-generated method stub
		System.out.println("EmployeeRepositoryImpl : Deletin employee");
		super.remove(Department.class, eno);
	}

}
