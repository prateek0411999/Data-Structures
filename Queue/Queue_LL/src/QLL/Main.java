package QLL;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		QueueLinkedList q = new QueueLinkedList();
		q.enqueueRear(1);
		q.enqueueRear(2);
		q.enqueueRear(3);
		q.enqueueRear(4);
		q.enqueueFront(5);
		q.dequeueFront();
		q.dequeueFront();
		q.dequeueFront();
		q.dequeueFront();
		q.dequeueFront();
		q.dequeueFront();

	}

}