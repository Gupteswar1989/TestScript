package com.genericlib.programming;

import java.io.IOException;
import java.lang.reflect.Method;

import org.omg.CORBA.COMM_FAILURE;

public class ChildClass {
	

	
	public static void main(String[] args)throws Exception {
		
		int count=0;
		Class c;
		c=Class.forName("java.lang.Object");
		
		Method[] m=c.getDeclaredMethods();
		
		for (Method m1 : m) {
			count++;
			System.out.println(m1.getName());
			
		}
		
		System.out.println("The total Number OF menthod Prasent in OBJECT CLASS :" +count);
	}

}
