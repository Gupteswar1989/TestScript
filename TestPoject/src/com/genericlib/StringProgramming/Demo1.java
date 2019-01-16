package com.genericlib.StringProgramming;

public class Demo1 {

	public static void main(String[] args) {
		
		String s1=new String("Spring");
		
		s1.concat("Summer");
		
		String s2=s1.concat("winter");
		System.out.println(s2);
		s1=s1.concat("winter");
		System.out.println(s1);
		s1=s1.concat("fail");
		System.out.println(s1);
		

	}

}
