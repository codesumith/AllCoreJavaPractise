package test;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Time;
import java.time.LocalTime;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.swing.plaf.synth.SynthScrollBarUI;
public class DepositDAO {

	int k=0;
	
	public static String generateTransactionId() {
        Random random = new Random();
        int randomInt = 10000000 + random.nextInt(90000000);
        return Integer.toString(randomInt);
    }
	
	public int deposit(HttpServletRequest req) {
		try {
		Connection con =new DBConnection().getCon();
		PreparedStatement ps =con.prepareStatement("Update BankAccountDetails Set ACCBALANCE=ACCBALANCE + ? Where ACCNO =?");
		ps.setFloat(1, Float.parseFloat(req.getParameter("dep")));
		
		int an=(int) req.getServletContext().getAttribute("acn");
		System.out.println(an);
		
		ps.setInt(2, (int) req.getServletContext().getAttribute("acn"));
		
		k =ps.executeUpdate();
		
		if(k>0)
		{
			PreparedStatement ps1 =con.prepareStatement("Insert INTO Transaction values(?,?,?,?,?)");
			ps1.setInt(1, (int) req.getServletContext().getAttribute("acn"));
			ps1.setInt(2, Integer.parseInt(generateTransactionId()));
			ps1.setString(3,"Deposit");
			ps1.setTime(4, Time.valueOf(LocalTime.now()));
			ps1.setFloat(5, Float.parseFloat(req.getParameter("dep")));
			
			ps1.execute();
		}
		}catch(Exception e) {e.printStackTrace();}
		return k;
	}
}
