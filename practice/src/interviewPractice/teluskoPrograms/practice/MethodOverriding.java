package interviewPractice.teluskoPrograms.practice;

public class MethodOverriding {

	public static void main(String[] args) {
      
      
     santhosh obj=new santhosh();
      obj.show();
		
		
		
	}

}
class pavan{
	
 public void show()
	{
		System.out.println("in show pavan");
	}
}
class santhosh extends pavan
{
	public void show()
	{
		System.out.println("in show santhosh");
	}
}
