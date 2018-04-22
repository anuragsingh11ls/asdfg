package test.core;

public class tryTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try{
			int i=10;
			int j=0;
			int k=i/j;
			System.out.println(k);
			
		}finally{
			System.out.println("kkkkkkk");
		}
	}

}
