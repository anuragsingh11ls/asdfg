package test.singalton;

public class TestInheritance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		A a=new A();
		B b=new B();
		a.setfName("anurag");
		b.setfName("singh");
		
		System.out.println(a.getfName());

	}

}
