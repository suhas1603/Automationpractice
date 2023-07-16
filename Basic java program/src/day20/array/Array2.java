package day20.array;

public class Array2 {

	public static void main(String[] args) {
		//create an array
		int[] age= {12,4,25,2,5};
		//accessing the array
		System.out.println("Accessing the element of array");
		System.out.println("First element : "+age[0]);
		System.out.println("second element : "+age[1]);
		System.out.println("third element : "+age[2]);
		System.out.println("fourth element : "+age[3]);
		System.out.println("Fifth element : "+age[4]);
		System.out.println(age.length);
		System.out.println("***************Using for Loop:*********");
		for(int i=0;i<age.length;i++) {
			//System.out.println(age[i]);
			if(age[i]==25) {
				System.out.println(age[i]);
				break;
			}else {
				System.out.println("age is not 25");
			}
		}
		System.out.println("***************Using for-each Loop:*********");
		for(int i : age) {
			//System.out.println(i);
			if(i==25) {
				System.out.println(i);
				break;
				
			}else {
				System.out.println("age is not 25");
			}
		}

}
}