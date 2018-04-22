package test.core;

public class Test1 {
	static Test1 t;

	/**
	 * @param args
	 */
	void play(){
		System.out.println("anurag");
	}
	public static void main(String[] args) {
		
		System.out.println(t.hashCode());
			t=	new Test1();
		System.out.println(t.hashCode());
		//t.play();

	}

}
