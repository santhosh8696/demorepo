package interviewPractice.teluskoPrograms.practice;


class Upcasting
{
	void show1()
	{
		System.out.println("in A show1");
	}
}

class DownCasting extends Upcasting
{
	void show2()
	{
		System.out.println("in B show2");
	}
	
}
public class UpcastingAndDownCasting {

	public static void main(String[] args) {
        
		Upcasting obj1=new DownCasting();//(upcasting)
		
   obj1.show1();//here parent doesnot know the child object so thats why show2 method not appeared
		
   DownCasting obj2=(DownCasting) obj1;//(downcasting) here we converting upcasting obj into downcasting
		obj2.show1();  //we extending upcasting for downcasting
		obj2.show2(); //so that is reason we get show2 method
		
	}

}
