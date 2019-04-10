public class LinkedList{

	private Node first;
	
	static class Item{

		int itemID;
		String name; 
		
		public Item(){
			itemID = 0;
			name = "";
		}
		
		public Item(int ID, String name){		
			itemID = ID;
			this.name = name;	
		}
	
		public void setItemID(int ID){
			itemID = ID;
		}
		
		public int getItemID(){
			return itemID;
		}
		
		public void setName(String name){
			this.name = name;
		}
		
		public String getName(){
			return name;		
		}
		
		public String toString(){
			return ("Item name: " + name + " Item ID: " + itemID);
		}
		
		
	}
	
	class Node{
		
		Node next;
		Item data;
		
		public Node(Item item){		
			data = item;
		}
		
		public void displayNode(){
			System.out.print(data.toString() + " ");
		}
		
	}
	
	public LinkedList(){
		first = null;
	}
	
	public boolean isEmpty(){
		return(first==null);
	}
	
	public void insertFirst(Item data){
		Node newNode = new Node(data);
		newNode.next = first;
		first = newNode;
	}
	
	public void displayLinkedList(){
		System.out.println("First to Last -->");
		
		Node currentNode = first;
		
		while(currentNode != null){
			currentNode.displayNode();
			currentNode = currentNode.next;
		}
		
		System.out.println("");
		
	}
	
	public static void main(String[] args){
		
		LinkedList list = new LinkedList();
		
		list.insertFirst(new Item(0,"Apple"));
		list.insertFirst(new Item(1,"Banana"));
		list.insertFirst(new Item(2,"Carrot"));
		list.insertFirst(new Item(3,"Spinach"));
		list.insertFirst(new Item(4,"Rutabaga"));

		list.displayLinkedList();	
	}
	
}
