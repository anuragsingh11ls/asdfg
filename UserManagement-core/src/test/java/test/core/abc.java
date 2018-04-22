/**
 * 
 */
package test.core;

/**
 * @author Anurag Singh
 *
 */
public class abc {
	

	/**
	 * @param args
	 */
	public static void main(final String[] args) {
		abc a=null;
		abc a2 = a;
	
		
		String s1= new String("shankar");
		String s2= "shankar";
		String s3= s1;

		
		StringBuffer s11= new StringBuffer("Shankar");
		StringBuffer s22= new StringBuffer("Shankar");
		StringBuffer s33= s11;
		 
		
		
		System.out.println("--1--->"+s1.equals(s2));
		System.out.println("--2--->"+s1==s2);
		System.out.println("--3--->"+s1.equals(s3));
		System.out.println("--4--->"+s1==s3);
		
		System.out.println("--5--->"+s11.equals(s22));
	//	System.out.println("--6--->"+s11==s22);
		
		System.out.println("--7--->"+s11.equals(s33));
	//S	System.out.println("--8--->"+s11==s33);
		
		
		

	}




}
