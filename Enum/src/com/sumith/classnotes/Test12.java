package com.sumith.classnotes;

public class Test12 {
	enum Day{
		SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
	}

	public static void main(String[] args) {
	
		Day day=Day.SATURDAY;
		
		switch(day)
		{
		case SUNDAY:
			System.out.println("Sunday");
			break;
		case MONDAY:
			System.out.println("Monday");
			break;
		case TUESDAY:
			System.out.println("Tuesday");
			break;
		case WEDNESDAY:
			System.out.println("Wednesday");
			break;
		case THURSDAY:
			System.out.println("Thursday");
			break;
		case FRIDAY:
			System.out.println("Friday");
			break;
			default:
				System.out.println("Other day");
		
		
		}
	}

}
