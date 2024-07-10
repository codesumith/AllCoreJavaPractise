package com.sumith.RetriveTotalSal_oct13;
import java.util.*;
import java.sql.*;

public class FunctionRetrivingTotalSalWithID {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		try(s)
		{
			try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practise","root","Sumith@349");
				
				System.out.println("Enter Employee Id :");
				String eid =s.nextLine();
				
				CallableStatement cs=con.prepareCall("{? = Call retrieveTotalSal56(?)}");
				
				cs.registerOutParameter(1, Types.FLOAT);
				cs.setString(2, eid);
				
				cs.execute();
				
				System.out.println("Employee ID:"+eid+"\tTotalSalary :"+cs.getFloat(1));
				
				con.close();
			}//end of try
			catch(Exception e) {e.printStackTrace();}
		}// end of try with resource
	}

}
