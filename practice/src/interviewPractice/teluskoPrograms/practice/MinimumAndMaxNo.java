package interviewPractice.teluskoPrograms.practice;

public class MinimumAndMaxNo {

	public static void main(String[] args) {

		
		int a[]= {4,8,2,6,9,5};
		
		int min=a[0];
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("min :"+min+"  ;max :"+max);
	}

}
