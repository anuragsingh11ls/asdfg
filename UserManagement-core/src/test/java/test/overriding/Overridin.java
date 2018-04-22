package test.overriding;
 class A1
{
	public  void m1()
	{
		System.out.println("I m A1 m1");
	}
}
 class B1 extends A1
{
	 public B1()           //this will call only super class m1() method  
	 {
		 super.m1();
	 }
	
	public  void m1()//overriding method
	{
		System.out.println("I m b1 m1");
	}
}

public class Overridin
{

	public static void main(String[] args) 
	{
	
		
		A1 a=new B1();
		//   or
		B1 b=new B1();//this will gives also above answer.
	     
		//a.m1();
		b.m1();
	
	
	}

}
