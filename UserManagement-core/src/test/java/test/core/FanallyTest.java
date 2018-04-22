package test.core;

public class FanallyTest {

	/**
	 * @param args
	 */
	static int i;
	public static void main(String[] args) {
		try{
			int i=9;
			System.out.println("am in try");
			
			return ;
		}catch (Exception e) {
			System.out.println("am in catch");
		}finally{
			System.out.println("am in finally");
		}
		System.out.println("hhhhhhhhh");

	}

}
