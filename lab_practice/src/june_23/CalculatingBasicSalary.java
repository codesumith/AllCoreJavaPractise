package june_23;

public class CalculatingBasicSalary {

	public static void main(String[] args) {
int ba=Integer.parseInt(args[0]);
double Hra=0.15*ba;
double conveyance=0.15*ba;
double Entertainment=0.10*ba;
double Totalsalary=ba+Hra+conveyance+ Entertainment;
System.out.println("----------------------------------------------Basic Salary----------------------------------------------------");
System.out.println("Emp name    House Rent Allowance    coveyance Allowance   Entertainmnt Allowance   Basic Salary  Total Salary");
System.out.println("---------------------------------------------------------------------------------------------------------------");
System.out.println("  Arjun      15%                              15%                   10%               "+ba);
System.out.println("             Total Salary="+ba+Hra +conveyance + Entertainment);



System.out.println("BasicSalary="+Totalsalary);


	}

}
