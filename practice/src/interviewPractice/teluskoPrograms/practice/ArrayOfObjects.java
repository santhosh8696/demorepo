package interviewPractice.teluskoPrograms.practice;

public class ArrayOfObjects {

	public static void main(String[] args) {

		Student s1=new Student();
		
		s1.rollNo=1;
		s1.name="pavan";
		s1.marks=80;
		
Student s2=new Student();
		
		s2.rollNo=1;
		s2.name="sudheer";
		s2.marks=90;
		
Student s3=new Student();
		
		s3.rollNo=1;
		s3.name="pavan";
		s3.marks=60;
		
		
		
		Student students[]=new Student[3];
		
		students[0]=s1;
		students[1]=s2;
		students[2]=s3;
		
		int i=0;
		while(i<students.length)
		{
			System.out.println(students[i].name+" : "+students[i].marks);
		   i++;
		}
	}
	


}
class Student{
	
	int rollNo;
	String name;
	int marks;
}