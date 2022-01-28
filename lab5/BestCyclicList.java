package lab5;

public class BestCyclicList<T> {
	private Node<T> head = null;
	private Node<T> last = null;
	
	public void add(T value) {
		Node<T> tempNode = new Node<T>(value);
		if(head == null) {
			head = tempNode;
		}
		else {
			last.nextNode = tempNode;
		}
		last = tempNode;
		last.nextNode = head;
	}
}
