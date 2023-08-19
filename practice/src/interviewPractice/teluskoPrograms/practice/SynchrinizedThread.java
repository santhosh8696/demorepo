package interviewPractice.teluskoPrograms.practice;

class Counter
{
	int count=0;
	
	//here we apply synchronized it will call only one thread
public synchronized	void increment()
	{
		this.count++;
	}
	
}



public class SynchrinizedThread {

	public static void main(String[] args) throws InterruptedException {
		
		Counter obj=new Counter();
		Runnable obj1=()->{
		
				for(int i=1;i<=50;i++)
				{
					
					obj.increment();
				}
			};
		Runnable obj2=()->{
			for(int i=1;i<=50;i++)
			{
				
				obj.increment();
			}
		};
			
      
//		Exmple1 obj1=new Exmple1();
//		Exmple2 obj2=new Exmple2();
		
		// obj1.setPriority(Thread.MAX_PRIORITY);

		Thread t1=new Thread(obj1);
		Thread t2=new Thread(obj2);
	
		t1.start();
		t2.start();
	
		t1.join();
		t2.join();
		System.out.println(obj.count);
	}

}