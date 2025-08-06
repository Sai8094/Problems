package com.oop;

public class TestMyArray {

	public static void main(String[] args) {
		MyArray my = new MyArray(10);
		my.add(12);
		my.add(56);
		System.out.println(my.get(0));
		System.out.println(my.get(80));
		System.out.println(my.size());

	}

}
