package org.student;

import org.college.College;
import org.department.Department;

public class Student {
	public void studentName() {
	}
	public void studentDept() {
	}
	public void studentId() {
	}
	public static void main(String[] args) {
		
		College col = new College();
		col.collegeCode();
		col.collegeName();
		col.collegeRank();
		
		Department dept = new Department();
		dept.deptName();
		
		Student st = new Student();
		st.studentName();
		st.studentId();
		st.studentDept();
		
		
	}

}
