package com.sumith.retriving_cust_details_using_procedure_oct13;
import java.util.*;
import java.sql.*;

public class RetrivalOfCustmerSDetails {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		
		try(s)
		{
			
			try
			{
				//it will load and register the mysql jdbc  driver 
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/practise","root","Sumith@349");
				
				System.out.println("Enter AccountNumber To Fetch Detais :");
				long ac=Long.parseLong(s.nextLine());
				
				CallableStatement cs=con.prepareCall("{CALL retrieveCust56(?,?,?,?,?,?,?,?,?)}");
				
				cs.setLong(1, ac);
				cs.registerOutParameter(2, Types.VARCHAR);
				cs.registerOutParameter(3, Types.FLOAT);
				cs.registerOutParameter(4, Types.VARCHAR);
				cs.registerOutParameter(5, Types.VARCHAR);
				cs.registerOutParameter(6, Types.VARCHAR);
				cs.registerOutParameter(7, Types.INTEGER);
				cs.registerOutParameter(8, Types.VARCHAR);
				cs.registerOutParameter(9, Types.BIGINT);
				
				cs.execute();
				
				System.out.println("-----------------------------------");
				System.out.println("| Accno         :"+ac+
						          "\n| Customer Name :"+cs.getString(2)+
						          "\n| Balance       :"+cs.getFloat(3)+
						          "\n| AccountType   :"+cs.getString(4)+
						          "\n| City          :"+cs.getString(5)+
						          "\n| State         :"+cs.getString(6)+
						          "\n| PinCode       :"+cs.getInt(7)+
						          "\n| Mail-ID       :"+cs.getString(8)+
						          "\n| PhnNo         :"+cs.getLong(9));
				System.out.println("-----------------------------------");
				con.close();
				
			}//end of try
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}//end of try with resource

		
	}

}
