package day5.conditions;

public class IfCondition3 {

	public static void main(String[] args) {
		// checking for leap year
		int year = 2000;
		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
			System.out.println("LEAP YEAR");
		} else {
			System.out.println("COMMON YEAR OR NOT LEAP YR");
		}

	}

}
