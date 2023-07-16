package day5.conditions;

public class NestedIf {

	public static void main(String[] args) {
		int age = 18;
		int weight = 50;
		if (age >= 18) {
			System.out.println("candidate age :" + age);
			if (weight > 50) {
				System.out.println("you are eligible to donate blood");
			} else {
				System.out.println("you are not eligible as your weight is below 50");
			}
		} else {
			System.out.println("age must be grater than 18");
		}

	}

}
