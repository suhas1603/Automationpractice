package arrayassign;

public class CopyArray {

	public static void main(String[] args) {
		//initialize array
		int[] arr1=new int[]{1,2,3,4,5};
		//create another arr2 with same size ofarr1
		int[] arr2=new int[arr1.length];
		//copying all the elements
		for(int i=0;i<arr1.length;i++) {
			arr2[i]=arr1[i];
		}
		//display arr1
		 System.out.println("Elements of original array: ");    
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i] +" ");
		}
		//printing arr2
		  System.out.println("Elements of new array: ");    
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i]+" ");
		}

	}

}
