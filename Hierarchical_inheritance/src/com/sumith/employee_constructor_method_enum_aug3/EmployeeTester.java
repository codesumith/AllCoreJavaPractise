package com.sumith.employee_constructor_method_enum_aug3;

public class EmployeeTester
{
    public static void main(String[] args)
    {
        Employee e= new Employee("jhn", 111, 50000);
        System.out.println(e);
        Manager m=new Manager("anil", 111, 20000, ManagerType.HR);
        System.out.println(m.getName());
        System.out.println(m.getSalary());
        System.out.println(m.getEmployeeId());
       
        
    }
}
