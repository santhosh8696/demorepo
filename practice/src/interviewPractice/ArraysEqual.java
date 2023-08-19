package interviewPractice;

import java.util.Arrays;

public class ArraysEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []n1= {1,2,3,4,5};
		int n2[]= {1,2,3,6,5};
		
		if(n1.length==n2.length)
		{
			Arrays.sort(n1);Arrays.sort(n2);
		}	
		boolean result=	Arrays.equals(n1,n2);
System.out.println(result);

	}

}
