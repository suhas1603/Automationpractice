package day13.finalkeywordandblocks;

public class FinalKeyword01 {

	public static void main(String[] args) {
		final int age=20;
		System.out.println("age: "+age);
		//age=25;
		System.out.println("age: "+age);
	//	age=30;
		System.out.println("age: "+age);
		//age=34;
		System.out.println("age: "+age);
        //gives error here becuase of final   
	}

}
/*
* anything declared with final keyword known as constant
* any variable declared with final keyword should initialize at the same time
*
*/