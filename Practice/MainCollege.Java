package com.inheritance;

public class MainClass {

	public static void main(String[] args) {
    Monitor m = new Monitor();
		m.collegename();
		m.study();
		m.monitor();
		System.out.println("---------------------------------");
		Teacher t = new Teacher();
		t.teacher();
		
	}
}
------------------------------------------------------------------------------------------------------------
OUTPUT :
College Name is --- ABCD College
Student is studying
Monitor maintain discipline
---------------------------------
Teacher is teaching 
