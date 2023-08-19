package interviewPractice.teluskoPrograms.practice;

abstract class Car
{
	//abstract class have abstract method and normal methods
	public abstract void drive();
      abstract public void fly();
  	public void gear()
  	{
  		System.out.println("gear...");
  	}
	
}
abstract class WagonR extends Car
{
	
	public void drive()
	{
		System.out.println("car driving...");
	}
}
class UpdatedWagonR extends WagonR //concrete class
{


	@Override
	public void fly() { //we need to override abstract method in normal class
		System.out.println("fly driving...");
		
	}
	
}


public class AbstractClass {

	public static void main(String[] args) {
	//we cannot create object for abstract class but we can assign obj to abstract class 
		Car obj=new UpdatedWagonR();
		obj.drive();
		obj.fly();
		obj.gear();
		

	}

}
