package interviewPractice.teluskoPrograms.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student1
{
	int age;
	String name;
	
	public Student1(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}


	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}
	
	
}


public class Collection2Comparator {

	public static void main(String[] args) {
		
//		Comparator<Student1> com= new Comparator<Student1>() {
//			
//			
//			public int compare(Student1 i, Student1 j) {
//				
//				if(i.age>j.age)
//					return 1;
//				else	
//				   return -1;
//			}
//		};

		//comparator=if first element is bigger than second it is swap means return 1
		//else return -1(not changed)
		Comparator<Student1> com= ( i, j)->(i.age>j.age)?1:-1;
			
//			if(i.age>j.age)
//				return 1;
//			else	
//			   return -1;
		
	


		
		List<Student1> list =new ArrayList<>();
		list.add(new Student1(43, "rahul"));
		list.add(new Student1(13, "ganesh"));
		list.add(new Student1(11, "suresh"));
		list.add(new Student1(2, "tharun"));
		Collections.sort(list,com);
		System.out.println(list);
		
//		for(Student1 s:list)
//		{
//			System.out.println(s);
//		}
	}

}
