package com.sumith.try_catch_blocks;

public class PrintStackTrace {

	public static void main(String[] args) {

		System.out.println("Main method started....");
		try {
			String x = "Ravi";
			int y = Integer.parseInt(x);
			System.out.println(y);

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("---------------------");
			System.err.println(e.getMessage());
		}
		System.out.println("Main method ended..!!");
	}

}
