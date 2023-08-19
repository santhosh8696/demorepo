package interviewPractice.teluskoPrograms.practice;

enum Status
{
	Running,Failed,Pending,Success;
}


public class EnumExmple {

	public static void main(String[] args) {

		Status s=Status.Success;
		
		if(s==Status.Running)
			System.out.println("All good");
		else if(s==Status.Failed)
			System.out.println("please try again");
		else if(s==Status.Pending)
			System.out.println("please wait");
		else
			System.out.println("done");
		
		
		Status ss[]=s.values();
		
		for(Status f:ss)
		{
			System.out.println(f+ " : "+f.ordinal());
		/*Running : 0   ---> start with index Number
			Failed : 1
			Pending : 2
			Success : 3 */
		}
	}
     
}
