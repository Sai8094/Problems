package com.queue;

import com.linkedlist.Node;
import com.stack.MainStack;

public class QueueOperations<T extends Comparable<T>> {

	int size = 0;

	public Node<T> front;
	public Node<T> rear;
	public T[] input;

	public void enqueue(T data) {
		Node<T> node = new Node<>(data);

		if (front == null) {
			front = rear = node;
		} else {
			rear.next = node;
			node.previous = rear;
			rear = node;
		}
		size++;
	}

	public T dequeue() {
		if (front == null) {
			throw new IndexOutOfBoundsException("Queue is empty");
		}
		T data = front.data;
		front = front.next;
		if (front != null) {
			front.previous = null;
		} else {
			rear = null;
		}
		size--;
		return data;
	}

	public T peek() {
		if (isEmpty()) {
			System.out.println("Queue is empty!");
			return null;
		}
		return front.data;
	}

	public boolean isEmpty() {
		return front == null;
	}

	public void display() {
		Node<T> temp = front;
		while (temp != null) {
			System.out.print(temp.data);
			if (temp.next != null)
				System.out.print("-->");
			temp = temp.next;
		}
	}

	int size() {
		return size;
	}

	public void reverse(Node<T> front) {
		MainStack<T> stack = new MainStack<>();
		QueueOperations<T> queue = new QueueOperations<>();

		Node<T> temp = front;
		while (temp != null) {
			stack.push(temp.data);
			temp = temp.next;
		}

		while (!stack.isEmpty()) {
			queue.enqueue(stack.pop());
		}
		System.out.println();
		queue.display();
	}

}
