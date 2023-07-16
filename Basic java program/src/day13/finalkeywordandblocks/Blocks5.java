package day13.finalkeywordandblocks;

public class Blocks5 {
	/* static block or SIB */
	static {
		System.out.println("running static-block-1 of class Blocks5..");
	}
	/* non-static block or IIB */
	{
		System.out.println("running non-static-block-1 of class Blocks5..");
	}

	public static void main(String[] args) {
		System.out.println("main()starts");
		Blocks5 b1 = new Blocks5();
		System.out.println("--------------------------");
		Blocks5 b2 = new Blocks5();
		System.out.println("main()ends");
	}

}
//we can execute non static block number of times by creating object... 