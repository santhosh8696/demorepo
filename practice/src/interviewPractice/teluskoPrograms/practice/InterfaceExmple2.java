package interviewPractice.teluskoPrograms.practice;

interface Computer
{
	void code();
}


class Laptop1 implements Computer
{
	public void code()
	{
		System.out.println("in Laptop");
	}
}
class Desktop implements Computer
{
    public void code()
	{
		System.out.println("in desktop");
	}
}


public class InterfaceExmple2 {

	public static void main(String[] args) {

		Computer lap=new Laptop1();
		
		Computer desk=new Desktop();
		
		lap.code();
		desk.code();
	}

}
