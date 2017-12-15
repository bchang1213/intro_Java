package SinglyLinkedList;
class SinglyLinkedList {
	//Declaring attribute.
	public Node head;
	
	//constructor method
	public SinglyLinkedList() {
		this.head = null;
	}
	
	
	//class method
	public void add(int value) {
		Node newNode = new Node(value);
		
		if(head == null) {
			head = newNode;
		}
		else {
			Node runner = head;
			while(runner.next != null) {
				runner = runner.next;
			}
			runner.next = newNode;
		}
	}
	//class method
	public void remove() {
		if(head == null) {
			System.out.println("List has no nodes. Cannot remove non-existent node.");
		}
		else if(head.next == null) {
			head = null;
		}
		else {
			Node runner = head;
			while(runner.next.next != null) {
				runner = runner.next;
			}
			runner.next = null;
		}
	}
	//class method
	public void printValues() {
		if(head == null) {
			System.out.println("The list in empty.");
		}
		Node current = this.head;
		int count = 0;
		while(current != null) {
			count ++;
			System.out.println("Node " + count + ":"+ current);
			current = current.next;
		}
	}
}