package in.sp.beans;

import org.springframework.stereotype.Component;

import org.springframework.beans.factory.annotation.Value;

@Component
public class Student {
	@Value("Ani")
	private String name;
	@Value("100")
	private int rollno;
	@Value("94.66f")
	private float marks;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	public void display(){
		System.out.println("Name :"+name);
		System.out.println("Rollno :" +rollno);
		System.out.println("Marks : "+marks);
	}
	

}
