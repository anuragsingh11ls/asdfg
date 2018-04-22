package test.singalton;

//This is the class for Singleton class Example.And it's implementation class is Dpattern

class Stest1 
{
	private static Stest1 t;
	 Stest1()
	{
		System.out.println("Object Created at First Time");
	}
	public static Stest1 create() 
	{
		if(t==null)
		{
			t=new Stest1();
		}
		else
		{
			System.out.println("Object Already Created "+t);
		}

		return  t;
	}
	public Object clone()  {
		return t;
	}
}



//This is  the implementation class of Stest Singleton class or main class for singleton design patteren implementation.
//or main program for singleton design pettern.
public class SingletonDesignpattern 
{

	public static void main(String[] args) throws CloneNotSupportedException
	{
		
		Stest1 t1= Stest1.create();
		Stest1 t2= Stest1.create();
		Stest1 t3= Stest1.create();
		
		Stest1 tobj=(Stest1)new Stest1().clone();
		Stest1 tobj1=(Stest1)new Stest1().clone();
		System.out.println("fff"+tobj);
		System.out.println("fff"+tobj1);
		
		

		if((t1==t2)&&(t2==t3)&&(t3==t1))
		{
			System.out.println("All Created Object are Same");
		}
		else
		{
			System.out.println("All Created  Object are not Same");
		}
	}



}



