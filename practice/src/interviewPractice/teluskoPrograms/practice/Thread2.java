package interviewPractice.teluskoPrograms.practice;

class Exmple11 implements Runnable
{
	public void run()
	{
		int i=5;
		while(i>0)
		{
			System.out.println("First Thread");
			i--;
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
}

class Exmple22 implements Runnable
{
	public void run()
	{
		int i=5;
		while(i>0)
		{
			System.out.println("Second Thread");
			i--;
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}


public class Thread2 {

	public static void main(String[] args) {
 
		Exmple1 obj1=new Exmple1();
		Exmple2 obj2=new Exmple2();
		
		obj1.setPriority(Thread.MAX_PRIORITY);

		Thread t1=new Thread(obj1);
		Thread t2=new Thread(obj2);
	
		t1.start();
		t2.start();
	}

}
