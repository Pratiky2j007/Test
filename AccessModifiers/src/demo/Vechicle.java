package demo;

public class Vechicle 
{
	private void VechiclePrivateMethod()
	{
		System.out.println("Class 1 private method");
	}
	
	public void VechiclePublicMethod1()
	{
		this.VechiclePrivateMethod();
	}
	
	protected void VechicleProtectedMethod()
	{
		System.out.println("In vechicle protected method");
	}

}
