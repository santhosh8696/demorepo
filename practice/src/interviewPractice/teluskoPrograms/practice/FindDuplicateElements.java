package interviewPractice.teluskoPrograms.practice;

import java.util.HashSet;

public class FindDuplicateElements {

	public static void main(String[] args) {

		
//		int a[]= {4,2,5,3,5,4};
//		
//		for(int i=0;i<a.length;i++)
//		{
//			for(int j=i+1;j<a.length;j++)
//			{
//				if(a[i]==(a[j]))
//				{
//					System.out.println("duplicate elemnt  :"+a[i]);
//				}
//			}
//		}
		
		String b[]= {"c++","java","python","java"};
		Boolean flag=true;
		
		HashSet<String> hashlist=new HashSet<>();
		
		for(String l:b)
		{
		   if(hashlist.add(l)==false)
		   {
			   System.out.println("duplicate element :"+l);
			   flag=false;
		   }
		   }
		if(flag==true)System.out.println("no duplicates");
		}

	}


