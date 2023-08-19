package interviewPractice.teluskoPrograms.practice;

public class Encapsulation {

	public static void main(String[] args) {

		Abc obj=new Abc();
		obj.setName("pavan");
		String s=obj.getName();
		System.out.println(s);
		
	}

}
class Abc
{
	
	String name;
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
}