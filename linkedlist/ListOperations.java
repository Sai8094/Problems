package com.linkedlist;

public class ListOperations<T extends Comparable<T>> {

	public Node<T> head;

	public void add(T data) {
		if (head == null) {
			head = new Node<>(data);
			return;
		}
		Node<T> temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = new Node<>(data);
	}

	public void addFirst(T data) {
		Node<T> n = new Node<>(data);
		n.next = head;
		head = n;
	}

	public void addAtIndex(T data, int index) {
		Node<T> n = new Node<>(data);
		if (index == 0) {
			n.next = head;
			head = n;
		} else {
			Node<T> temp = head;
			while (temp != null && index > 1) {
				temp = temp.next;
				index--;
			}
			n.next = temp.next;
			temp.next = n;
		}
	}

	public T deleteAtFirst() {
		if (head == null) {
			System.out.println("List is Empty");
			return null;
		}
		T data = head.data;
		head = head.next;
		return data;
	}

	public T deleteAtLast() {
		if (head == null) {
			System.out.println("List is Empty");
			return null;
		}
		Node<T> temp = head;
		Node<T> previous = null;

		while (temp.next != null) {
			previous = temp;
			temp = temp.next;

		}
		if (previous == null) {
			head = null;
		} else {
			previous.next = null;
		}
		return temp.data;
	}

	public T delete(int index) {
		if (head == null) {
			System.out.println("List is Empty");
			return null;
		}
		Node<T> temp = head;
		Node<T> previous = null;

		while (temp.next != null && index > 0) {
			previous = temp;
			temp = temp.next;
			index--;
		}
		if (temp == null) {
			System.out.println("Index out of Bound");
			return null;
		}
		if (previous == null) {
			head = head.next;
		} else {
			previous.next = temp.next;
		}
		return temp.data;
	}

	public void display() {
		Node<T> temp = head;
		while (temp != null) {
			System.out.print(temp.data);
			if (temp.next != null) {
				System.out.print(" --> ");
			}
			temp = temp.next;
		}
		System.out.println();
	}

	public void reverse() {
		Node<T> prev = null;
		Node<T> cur = head;
		Node<T> next = null;

		while (cur != null) {
			next = cur.next;
			cur.next = prev;
			prev = cur;
			cur = next;
		}
		head = prev;
	}

	public boolean isCyclic() {
		if (head == null || head.next == null)
			return false;

		Node<T> slow = head;
		Node<T> fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;

			if (slow == fast)
				return true;
		}
		return false;
	}

	public int search(T data) {
		int position = 1;
		Node<T> temp = head;

		while (temp != null) {
			if (temp.data.equals(data)) {
				return position;
			}
			temp = temp.next;
			position++;
		}
		return -1;
	}

	public Node<T> findMiddle(Node<T> start, Node<T> end) {
		if (start == null)
			return null;

		Node<T> slow = start;
		Node<T> fast = start;

		while (fast.next != end && fast.next.next != end) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

	public Node<T> findMiddle(Node<T> head) {
		Node<T> slow = head;
		Node<T> fast = head;

		while (fast != null && fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

	public Node<T> sortLinkedList(Node<T> head) {
		if (head == null || head.next == null)
			return head;

		Node<T> middle = findMiddle(head);
		Node<T> rightHead = middle.next;
		middle.next = null;

		Node<T> left = sortLinkedList(head);
		Node<T> right = sortLinkedList(rightHead);

		return mergeTwoList(left, right);
	}

	public Node<T> mergeTwoList(Node<T> left, Node<T> right) {
		Node<T> cur = new Node<>(null);
		Node<T> temp = cur;

		while (left != null && right != null) {
			if (left.data.compareTo(right.data) < 0) {
				temp.next = left;
				left = left.next;
			} else {
				temp.next = right;
				right = right.next;
			}
			temp = temp.next;
		}

		if (left != null) {
			temp.next = left;
		} else {
			temp.next = right;
		}

		return cur.next;
	}

}
