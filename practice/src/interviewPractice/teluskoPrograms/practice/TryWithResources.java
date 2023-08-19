package interviewPractice.teluskoPrograms.practice;

import java.util.Scanner;

public class TryWithResources {

	public static void main(String[] args) {

		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		int num=sc.nextInt();
		try {
		System.out.println(4/num);
		}catch (Exception e) {
			e.printStackTrace();
		}
		}

}
