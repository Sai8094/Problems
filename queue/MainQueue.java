package com.queue;

public class MainQueue {
	
	public static void main(String[] args) {
		
		QueueOperations<Integer> queue = new QueueOperations<>();
		queue.enqueue(23);
		queue.enqueue(56);
		queue.enqueue(13);
		queue.enqueue(76);
		queue.enqueue(45);
		queue.enqueue(90);
		
		queue.display();
		System.out.println(queue.peek());
		
	}

}
