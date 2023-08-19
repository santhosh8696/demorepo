package interviewPractice.teluskoPrograms.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamApi1 {

	public static void main(String[] args) {
		
		List<Integer> nums=Arrays.asList(4,3,5,7,2,6);
		
		//nums.forEach(n->System.out.println(n));
//		int sum=0;
//		for(int n:nums)
//		{
//			if(n%2==0)
//			{
//				
//			    sum=sum+n*2;
//			}
//		}System.out.println(sum);
		
	int result=	nums.stream()
		.filter(n->n%2==0)
		.map(n->n*2)
		.reduce(0,(c,e)->c+e);
	System.out.println(result);
	
Stream<Integer> sortedValues= nums.stream()
	.filter(n->n%2==0)
	.sorted();
  sortedValues.forEach(n->System.out.println("sorted values :"+n));

	}

}
