package tests;

import java.util.*;  
public class TestSort1 {  
	public enum myEnum {ROLLNO, NAME, AGE};
	
public static void main(String args[]){  



ArrayList<Student> al=new ArrayList<Student>();  
 
al.add(new Student(102,"Ajay",22));  
al.add(new Student(104,"Vinod",24));  
al.add(new Student(103,"Vinay",24));  
al.add(new Student(106,"Aanand",24));  
al.add(new Student(101,"jay",23)); 
al.add(new Student(101,"New line added",260619)); 
Collections.sort(al);

for(Student st:al){  
System.out.println(st.rollno+" "+st.name+" "+st.age);
}


System.out.println("SuM-----" + Student.sum(al, myEnum.ROLLNO.toString()));
	char[] chars = new char[] {'\u0098'};
    String str = new String(chars);
    byte[] bytes = str.getBytes();
    System.out.println("new code"+ Arrays.toString(bytes));
    
}  
}  
