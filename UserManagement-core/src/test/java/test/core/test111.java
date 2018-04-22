package test.core;

public class test111 {
  static String s5="Shankar";

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String s1 = new String("shankar");
		String s2 = "shankar";
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		String s3 = s2;
		System.out.println(s3.hashCode());
		System.out.println(s1==s3);
		System.out.println(s2.equals(s1));
		String s4=s2.intern();
		System.out.println(s4.hashCode());
		System.out.println(s4.equals(s1));
		System.out.println(s1==s4);
		System.out.println((s5.intern().hashCode()==s1.hashCode()));


		System.out.println("--1--->" + s1.equals(s2));
		System.out.println("--4--->" + (s3 == s2));
		System.out.println("--3--->" + s1.equals(s3));

		StringBuffer s11 = new StringBuffer("Shankar");
		StringBuffer s22 = new StringBuffer("Shankar");
		StringBuffer s33 = s11;
//		StringBuffer s44 = "shankar";
		
		

		System.out.println("--2--->" + (s1 == s2));
		System.out.println("--5--->" + s22.equals(s11));
		System.out.println("--5--->" + s22.equals(s33));
//		System.out.println("--6--->" + s33 == s11);

		System.out.println("--7--->" + s11.equals(s33));
		System.out.println("--8--->" + (s33 == s11));

		StringBuilder sb1=new StringBuilder("shankar");
//		StringBuilder sb2="shankar";
		StringBuilder sb3=sb1;
		System.out.println("--7--->" + sb1.equals(sb3));
		System.out.println("--8--->" + (sb3 == sb1));
		
		
	}

}
