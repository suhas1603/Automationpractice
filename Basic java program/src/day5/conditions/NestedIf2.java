package day5.conditions;

public class NestedIf2 {

	public static void main(String[] args) {
		int age = 17;
		int weight = 58;
		char grp = 'A';
		if (age >= 18) {
			if (weight > 50) {
				if (grp == 'A') {
					System.out.println("you are eligible to donate blood ");
				} else {
					System.out.println("you are not eligible as blood grp is not matching");
				}
			} else {
				System.out.println("you are not eligible as weight is below 50");
			}
		} else {
			System.out.println("you are not eligible as you are underage");
		}

	}

}
