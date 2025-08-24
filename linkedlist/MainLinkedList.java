package com.linkedlist;

public class MainLinkedList {

	public static void main(String[] args) {

		ListOperations<Integer> list1 = new ListOperations<>();
		list1.add(56);
		list1.add(12);
		list1.add(23);
		list1.add(78);
		list1.add(89);
		list1.display();
		list1.reverse();
		list1.display();
		System.out.println(list1.isCyclic());
		System.out.println(list1.search(23));
		list1.head = list1.sortLinkedList(list1.head);
		list1.display();
		
		ListOperations<Integer> list2 = new ListOperations<>();
		list2.add(26);
		list2.add(78);
		list2.add(13);
		list2.add(80);
		list2.add(9);
		list2.display();
		list2.reverse();
		list2.display();
		System.out.println(list2.isCyclic());
		System.out.println(list2.search(23));
		list2.head = list2.sortLinkedList(list2.head);
		list2.display();

	}

}
