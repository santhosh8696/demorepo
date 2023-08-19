package interviewPractice.teluskoPrograms.practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Collections {

	public static void main(String[] args) {
		
		
		Set<Integer> list=new TreeSet<Integer>();

	        list.add(23);
	        list.add(13);
	        list.add(22);
	        list.add(11);
	        list.add(10);
	        list.add(10);
	        
	     Iterator i=  list.iterator();
//	        while(i.hasNext())
//	        {
//		        System.out.println(i.next());
//
//	        }
	        
	        
	        Map<String, Integer> students = new HashMap<>();
	        
	        students.put("pavan", 10);
	        students.put("sudheer", 9);
	        students.put("santhosh", 30);
	        students.put("raj", 4);
	        
	     //   System.out.println(students);
	        
	        System.out.println(students.keySet());
	        
	        for(String key:students.keySet())
	        {
	        	System.out.println(key+ " : "+students.get(key));
	        }
	}

}
