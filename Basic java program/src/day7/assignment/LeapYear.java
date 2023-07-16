package day7.assignment;

public class LeapYear {

	public static void main(String[] args) {

		int x = 2023;
		if (((x % 400 == 0) && (x % 100 != 0)) || (x % 4 == 0)) {
			System.out.println("LEAP YEAR");
		} else {
			System.out.println("COMMON YEAR");
		}

	}

}
