package interviewPractice.teluskoPrograms.practice;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {

		int a[]= {4,1,5,3,2,6};
//		int[] b=new int[] {a.length};
		System.out.println("Before sorting :"+Arrays.toString(a));
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
//		            int temp=a[j];
//		            a[j]=a[j+1];
//		            a[j+1]=temp;
					
		            
		            a[j]=a[j+1]+a[j];
		         
		            a[j+1]=a[j]-a[j+1];
		            a[j]=a[j]-a[j+1];
				}
			}
		}System.out.println("After sorting :"+Arrays.toString(a));
	}

}
