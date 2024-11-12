package com.tns.ifet.day4.thirdpackage;
public class PrivateConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass m=MyClass.getObject();
		m.setId(10);
		
		MyClass m1=MyClass.getObject();
		
		System.out.println(m);
		System.out.println(m1);
	}

}
