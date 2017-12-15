package SinglyLinkedList;
public class ListTester{
	public static void main(String[] args) {
		SinglyLinkedList s = new SinglyLinkedList();
		s.add(10);
		s.add(9);
		s.add(8);
		s.printValues();
		s.remove();
		s.printValues();
	}
}