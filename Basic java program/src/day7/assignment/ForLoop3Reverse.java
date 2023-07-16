package day7.assignment;

public class ForLoop3Reverse {

	public static void main(String[] args) {
		int num = 12345, reverse = 0;
		// we have not mentioned initialization part of for loop
		for (; num != 0; num /= 10) {
			int remainder = num % 10;
			reverse = reverse * 10 + remainder;
		}
		System.out.println("The reverse of the given num is " + reverse);
	}

}
/*first remain- 5   rev -5
 * second num=1234  remain=4 rev=5*10+4=54
 * third  num=123   remain=3 rev=54*10+3=543
 * fourth num=12    remain=2 rev=543*10+2=5432
 * fifth  num=1     remain=1 rev=5432*10+1= 54321
 * 
*/