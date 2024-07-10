package com.sumith.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class Employee
{
	private Integer empId;
	private String empName;
	private Double empSalary;
	public Employee(Integer empId, String empName, Double empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(Double empSalary) {
		this.empSalary = empSalary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}
	
	
}
public class EmployeeLL {

	public static void main(String[] args) {
		
List <Employee> list =new LinkedList<>();
Employee e1=new Employee(1,"Virat",12000.89);
list.add(e1);
list.add(new Employee(2,"Rohith",13000.89));
list.add(new Employee(3,"Bumrah",14000.89));

Iterator<Employee> itr=list.iterator();
itr.forEachRemaining(emp ->System.out.println(emp.getEmpName()));

	}

}
