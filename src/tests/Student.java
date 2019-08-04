package tests;

import java.util.ArrayList;

class Student implements Comparable<Student> {  
int rollno;  
String name;  
int age;  


Student(int rollno,String name,int age){  
this.rollno=rollno;  
this.name=name;  
this.age=age;  
}  
 


//@Override
public int compareTo(Student st){  
if(rollno==st.rollno) {
	if(name.equals(st.name)) {
		return 0;
		}
		else if(name.compareTo(st.name)>0)  {
		return 1;  }
		else  {
		return -1;  
		}
}
else if(rollno>st.rollno)  {
return 1;  }
else  
return -1;  
}


public static int sum(ArrayList<Student> st, String name) {
	int sum = 0;
	
	if(name.equalsIgnoreCase("age")) {
	for(int i = 0; i<=st.size()-1; i++) {
		Student s = (Student) st.get(i);
		sum = sum + s.age;
		}
	}
	else if(name.equalsIgnoreCase("rollno"))
	{
		for(int i = 0; i<=st.size()-1; i++) {
			Student s = st.get(i);
			sum = sum + s.rollno;
		}
	}
	
	return sum;
	//method updated as per requirements - Git
	//sum modified at local-vb  --on 2
	//method updated as per requirements - Git // on 3
	//line 3.5 addded
	//addeed line 4
}










}
