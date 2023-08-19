package interviewPractice.teluskoPrograms.practice;

public class Constructor2 {

	public static void main(String[] args) {

		B obj=new B(2);
	}
	}
class C
{
	public C()
	{
		System.out.println("in C");
	}
	public C(int n)
	{
		this();
	  System.out.println("in C Int");	
	}
}
class B extends C
{
	public B(int n)
	{
		super(2);
		System.out.println("in B"+n);
	}


}