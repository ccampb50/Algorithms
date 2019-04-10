public class DoublyLinkedList{

	private Node next;
	private Node previous;

	class Node{
		
		private long data;
		private Node nextNode;

		public Node(long item){
			data = item;
		}

		public void displayNode(){
			System.out.print(data + " ");
		}
	}

	public DoublyLinkedList(){
		next = null;
		previous = null;
	}

	public boolean isEmpty(){
		return (next==null);
	}

	public void insertFirst(long item){
		Node newNode = new Node(item);

		if(isEmpty())
			previous = newNode; 
		else
			newNode.nextNode = next;
		next = newNode;
	}

	public long deleteFirst(){
		long temp = next.data;
		if(next.nextNode == null)
			previous = null;
		next = next.nextNode;
		return temp;
	}

	public void displayList(){
		System.out.println("List (first --> last)");
		Node currentNode = next;

		while(currentNode!=null){
			currentNode.displayNode();
			currentNode = currentNode.nextNode;
		}
		System.out.println();
	}

	public static void main(String[] args){
		DoublyLinkedList doubleList = new DoublyLinkedList();
		doubleList.insertFirst(22);
		doubleList.insertFirst(11);
		doubleList.insertFirst(33);
		doubleList.displayList();

		doubleList.deleteFirst();
		doubleList.insertFirst(44);
		doubleList.insertFirst(66);
		doubleList.insertFirst(77);
		doubleList.displayList();

	}

}

