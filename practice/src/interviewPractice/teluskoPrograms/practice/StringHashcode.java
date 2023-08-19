package interviewPractice.teluskoPrograms.practice;

import java.util.Objects;


 class Laptop
{
   String model;
   int price;
   
@Override
public String toString() {
	return "Laptop [model=" + model + ", price=" + price + "]";
}

@Override
public int hashCode() {
	return Objects.hash(model, price);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Laptop other = (Laptop) obj;
	return Objects.equals(model, other.model) && price == other.price;
}
	 
}
 
 public class StringHashcode {

		public static void main(String[] args) {

			Laptop obj=new Laptop();
			obj.model="LG";
			obj.price=40000;
			
			Laptop obj1=new Laptop();
			obj1.model="LG";
			obj1.price=40000;
			
			System.out.println("toStrong.... "+obj.toString());//print in tostring format
			
			System.out.println("Object hashcode.. "+obj.hashCode());//print object hashcode
			
			System.out.println("compare 2 objects with equals method.... "+obj.equals(obj1));//compare two objects with equals method 
		
		}

	}