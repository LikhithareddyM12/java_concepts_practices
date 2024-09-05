package java_encapsulation;

public class Student {
	private int rollNo;
	private String name;
	private boolean isAttended;
	
	public Student(int rollNo) {
		this.rollNo=rollNo;
		
	}
	public void setStudentAttendance(boolean flag) {
		if(!isAttended)
		isAttended = flag;
		System.out.println("teacher assigned attendance to the students");
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean getStudentAttendance() {
		System.out.println("Teacher accesed student attendance");
		return isAttended;
		
		
	}
	
	

}
