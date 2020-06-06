package QLL;

public class QueueLinkedList {
	Node front, rear;
	
	public void enqueueFront(int data) {
		Node node = new Node();
		node.data = data;
		
		if(front==null && rear == null) {
			front = node;
			rear = node;
		} else {
			node.link = front;
			front = node;
		}
	}
	public void enqueueRear(int data) {
		Node node = new Node();
		node.data = data;
		
		if(front==null && rear == null) {
			front = node;
			rear = node;
		} else {
			rear.link = node;
			rear = node;
		}
	}
	
public void dequeueFront() {
		
		if(front==null && rear == null) {
			System.out.println("No element is present");
		} else if(front == rear) {
			System.out.println(front.data);
			front = null; rear = null;
		} else {
			System.out.println(front.data);
			front = front.link;
		}
	}
	

}
