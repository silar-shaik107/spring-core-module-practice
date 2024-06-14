package com.springboot.cofig;


public class Student {
         private int stduentId;
         private String studentName;
         private String studentNumber;
         
        public Student() {
        	System.out.println("Student is Created");
        }

		public int getStduentId() {
			return stduentId;
		}

		public void setStduentId(int stduentId) {
			this.stduentId = stduentId;
		}

		public String getStudentName() {
			return studentName;
		}

		public void setStudentName(String studentName) {
			this.studentName = studentName;
		}

		public String getStudentNumber() {
			return studentNumber;
		}

		public void setStudentNumber(String studentNumber) {
			this.studentNumber = studentNumber;
		}
        
}
