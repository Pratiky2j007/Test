package demo;

public class MainClass {

	public static void main(String[] args) {
	Vechicle vecObj=new Vechicle();
	
	Car carobj=new Car();
	carobj.VechicleProtectedMethod();
	carobj.VechiclePublicMethod1();
	
	Animal animalObj=new Animal();
	animalObj.AnimalDefaultMethod();
	}

}
