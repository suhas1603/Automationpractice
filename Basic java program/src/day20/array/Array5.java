package day20.array;

class TestReturnArray{
	//creating the method which return array
	static int[] getarray() {
	//	int[] num=new int[3];
	//	num[0]=10;
	//	num[1]=30;
	//	num[2]=15;
	//	return num;
		//or
		return new int[] {10,30,50,90,60};
	}
}

public class Array5 {

	public static void main(String[] args) {
		//calling method which returns an array
		int[] arr=TestReturnArray.getarray();
		//printing the values
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		

	}

}
