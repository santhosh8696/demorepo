package interviewPractice.teluskoPrograms.practice;

public class DynamicMethodDispatch {

	public static void main(String[] args) {

      pavan1 obj=new pavan1();
      obj.show();
      
      
      obj=new santhosh1();
      obj.show();
		
		
		
	}

}
class pavan1{
	
 public void show()
	{
		System.out.println("in show pavan");
	}
}
class santhosh1 extends pavan1
{
	public void show()
	{
		System.out.println("in show santhosh");
	}
}
