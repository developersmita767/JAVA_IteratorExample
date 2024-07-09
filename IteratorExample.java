package Abacus;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {

	public static void main(String[] args) {
		
		List<Student> studentList=new ArrayList<Student>();
		Student st1=new Student(1, "ram" ,  60, "B");
		Student st2=new Student(2, "Shyam", 85, "A");
		Student st3=new Student(3, "Biju", 30, "E");
		Student st4=new Student(4, "Subrat", 76, "B");
		Student st5=new Student(5, "Deepak", 49, "D");
		Student st6=new Student(6, "Ashish", 56, "C");
		studentList.add(st1);
	     studentList.add(st2);
		studentList.add(st3);
		studentList.add(st4);
		studentList.add(st5);
		studentList.add(st6);
	    
		System.out.println("Student details");
	//	System.out.println("Student list size"+studentList.size());
		
		Iterator<Student> studentItr=studentList.iterator();
		
		while(studentItr.hasNext()) {
			Student st=studentItr.next();
			
			System.out.println(st.getName()+","+st.getPercent()+","+st.getGrade());
		}
		/*Collections.sort(studentList);
		System.out.println("================================================");
		Iterator<StudentNew> iter2=studentList.iterator();
		while(iter2.hasNext()) {
			StudentNew st=iter2.next();
			System.out.println(st.getName()+","+st.getAge());
*/
	}

}

