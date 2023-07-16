package day21.predefinedclasses.objectclass;

class TestSample{
	void callMe() {
		System.out.println("Hello");
	}
}

public class Example4 extends TestSample {
	static int last_roll = 100;
	int roll_no;
	// Constructor
	Example4()
    {
        roll_no = last_roll;
        last_roll++;
    }
	@Override
	public int hashCode() {
		return 505;
	}
	@Override
    public String toString()
    {
        return "BasicCoreJava";
    }

	public static void main(String[] args) {
		Example4 e1=new Example4();
		System.out.println(e1);
		System.out.println(e1.toString());
		System.out.println(e1.hashCode());
		TestSample t=new TestSample();
		System.out.println(t);
		System.out.println(t.hashCode());

	}

}
