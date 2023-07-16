package arrayassign;

public class ReverseArray {

	public static void main(String[] args) {
		int[] array1=new int[] {1,2,3,4,5};
		System.out.println("original array");
		for(int i=0;i<array1.length;i++) {
			System.out.println(array1[i]);
		}
		System.out.println("reverse array");
		for(int i=array1.length-1;i>=0;i--) {
			System.out.println(array1[i]);
		}

	}

}
