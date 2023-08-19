package interviewPractice.teluskoPrograms.practice;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class SortingWithMethods {

	public static void main(String[] args) {

		int a[]= {3,1,5,3,7,6,2,4};
		//first approach
		System.out.println("Before sorting..."+Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("Afer sorting..."+Arrays.toString(a));
		System.out.println();
		//second approach
//		System.out.println("Before sorting..."+Arrays.toString(a));
//		Arrays.parallelSort(a);
//		System.out.println("Afer sorting..."+Arrays.toString(a));
		
		//third approach(reverse order)
		Integer b[]= {3,1,5,3,7,6,2,4};
		System.out.println("Before sorting..."+Arrays.toString(b));
		Arrays.sort(b,Collections.reverseOrder());
		System.out.println("Afer sorting..."+Arrays.toString(b));
	}

}
