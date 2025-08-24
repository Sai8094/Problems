package com.queue;

import com.stack.MainStack;

public class StackImplementation<T extends Comparable<T>> {
	private MainStack<T> stack1;
	private MainStack<T> stack2;

	public StackImplementation() {
		stack1 = new MainStack<>();
		stack2 = new MainStack<>();
	}

	public void enqueue(T data) {
		stack1.push(data);
	}

	public T dequeue() {
		if (isEmpty()) {
			System.out.println("Queue is Empty!");
			return null;
		}

		if (stack2.isEmpty()) {
			while (!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
		}

		return stack2.pop();
	}

	public T peek() {
		if (isEmpty()) {
			System.out.println("Queue is Empty!");
			return null;
		}

		if (stack2.isEmpty()) {
			while (!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
		}

		return stack2.peek();
	}

	public boolean isEmpty() {
		return stack1.isEmpty() && stack2.isEmpty();
	}

	public void display() {
		if (isEmpty()) {
			System.out.println("Queue is Empty!");
			return;
		}

		if (stack2.isEmpty()) {
			while (!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
		}
		stack2.display();
	}

	public static void main(String[] args) {
		StackImplementation<Integer> queue = new StackImplementation<>();

		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);

		queue.display();
		System.out.println("Peek: " + queue.peek());

		System.out.println(queue.dequeue());
	}
}
