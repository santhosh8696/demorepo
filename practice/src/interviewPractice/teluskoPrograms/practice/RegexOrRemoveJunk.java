package interviewPractice.teluskoPrograms.practice;

public class RegexOrRemoveJunk {

	public static void main(String[] args) {

		
	   String s1= "#$##!$#!()*(fddfkf2314";
	
	   s1=s1.replaceAll("[^a-zA-Z0-9]","");
	   System.out.println(s1);
	   
	   
	}

}
