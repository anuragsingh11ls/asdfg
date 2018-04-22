package test.core;

public class TestInterface implements A, B {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		A a = new TestInterface();

		B b = new TestInterface();

		TestInterface to = new TestInterface();

		System.out.println("a---->");
		a.play();
		System.out.println("b---->");

		b.play();
		System.out.println("to---->");

		to.play();

	}

	public void play() {
		System.out.println("adfdsd");

	}

}

interface A {
	void play();
}

interface B {
	void play();
}