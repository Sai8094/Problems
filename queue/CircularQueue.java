package com.queue;

public class CircularQueue<T extends Comparable<T>> {
    private Object[] input;  
    private int front, rear, size, capacity;

    public CircularQueue(int k) {
        capacity = k;
        input = new Object[capacity];  
        front = -1;
        rear = -1;
        size = 0;
    }

    public void enqueue(T data) {
        if (isFull()) {
            System.out.println("Queue is Full!");
            return;
        }
        if (front == -1) { 
            front = 0;
        }
        rear = (rear + 1) % capacity;
        input[rear] = data;
        size++;
    }

    @SuppressWarnings("unchecked")
    public T dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty!");
            return null;
        }

        T item = (T) input[front];   // ✅ type cast required

        if (front == rear) { 
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % capacity;
        }

        size--;
        return item;
    }

    @SuppressWarnings("unchecked")
    public T peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty!");
            return null;
        }
        return (T) input[front];   
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public int getSize() {
        return size;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is Empty!");
            return;
        }

        System.out.print("Queue: ");
        int i = front;
        while (true) {
            System.out.print(input[i] + " ");
            if (i == rear) break;
            i = (i + 1) % capacity;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CircularQueue<Integer> queue = new CircularQueue<>(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        queue.display();

        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Dequeued: " + queue.dequeue());

        queue.display();

        queue.enqueue(60);
        queue.enqueue(70);

        queue.display();

        System.out.println("Front: " + queue.peek());
    }
}
