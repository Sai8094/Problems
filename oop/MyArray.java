package com.oop;

public class MyArray {
	int capacity;
	int size;
	int[] myArray;

	public MyArray(int capacity) {
		this.capacity = capacity;
		this.size = 0;
		this.myArray = new int[capacity];
	}

	void add(int element) {
		if (myArray.length == capacity)
			resize();
		myArray[size++] = element;
	}

	int size() {
		return size;
	}

	int get(int index) {

		if (index < 0 || index > myArray.length) {
			throw new IndexOutOfBoundsException("Invalid Index");
		}

		return myArray[index];
	}

	void resize() {
		capacity = capacity * 2;
		int[] newArray = new int[capacity];
		for (int i = 0; i < myArray.length; i++) {
			newArray[i] = myArray[i];
		}
	}

}
