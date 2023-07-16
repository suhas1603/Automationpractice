package day24.wrapperclass;

public class BoxingOperation2 {

	public static void main(String[] args) {
		char c1='A';
		Character charobj1=new Character(c1);
		System.out.println(c1==charobj1);
		Character charobj2=new Character('Z');
		
		Character charobj3='H';
		System.out.println("c1 : "+c1);
		System.out.println("charbj1 : "+charobj1);
		System.out.println("charbj2 : "+charobj2);
		System.out.println("charbj3 : "+charobj3);
		
		boolean b=true;//
		Boolean bObj=new Boolean(b);//
		System.out.println(bObj==b);

	}

}
