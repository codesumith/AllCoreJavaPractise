package com.sumith.HashMap;

public class Employee {
	
	int eid;
	String ename;
	public Employee(int eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}
	
	@Override
	public boolean equals(Object obj) //obj ==e2
	{
		boolean v=false;
		if(obj instanceof Employee)
		{
			Employee e2 = (Employee) obj;
			
			if(this .eid ==e2.eid&&this.ename.equals(e2.ename))
			{
				v=true;
				return v;
			}
			else
			{
				v=false;
				return v;
			}
		}
		else
		{
			System.out.println("Comparison is not possible");
		}
		return v;
	}

}
