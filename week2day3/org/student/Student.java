package org.student;

import org.department.Department;

public class Student extends Department {
	public void studentName()
	{
		System.out.println("Dhanalakshmi");
	}
	public void studentDept()
	{
		System.out.println("Dept of Computer Applications");
	}
	public void studentId()
	{
		System.out.println("1771");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stud=new Student();
		stud.collegeName();
		stud.collegeCode();
		stud.collegeRank();
		stud.deptName();		
		stud.studentName();
		stud.studentDept();
		stud.studentId();		

	}

}
