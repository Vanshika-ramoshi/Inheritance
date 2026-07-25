package com.inheritance;

public class MainClass {

	public static void main(String[] args) {
    
    Laptop l = new Laptop();
		System.out.println("-------Mobile-------");
		l.m1();
		l.m2();
		System.out.println("--------Laptop--------");
		l.m1();
		l.m3();
	}
}
-------------------------------------------------------------------------------------
  OUTPUT : 
-------Mobile-------
Device Power ONN
Mobile Is Making A Call
--------Laptop--------
Device Power ONN
Laptop Is For Coding
