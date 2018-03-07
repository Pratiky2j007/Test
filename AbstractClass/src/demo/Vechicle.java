package demo;

abstract class AbsClass
{
	AbsClass(int a,String b)
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println("In constructor abstract class");
	}
	abstract void Method1();
	public void Method2()
	{
		System.out.println("In method 2");
	}
}

public class Vechicle extends AbsClass
{
	Vechicle()
	{
		super(10,"Hello");
		System.out.println("In constructor Vechicle");
	}
	public void Method1() 
	{
		System.out.println("In Method1");
	}
	
	public void Method2()
	{
		super.Method2();
		System.out.println("In override method 2");
	}

}
