package interviewPractice.teluskoPrograms.practice;

public class RemoveEmptySpaces {

	public static void main(String[] args) {

		
		String s="hello how are you";
		
		s=s.replaceAll("\\s", "");
		System.out.println(s);
	}

}
