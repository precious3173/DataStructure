
public class Linked {
	Node head;
	Node tail;
	
	public void insert(int data) {
		
		Node node = new Node(data);
		node.data = data;
		
		node.next = null;
		node.prev = null;
		
		if(head == null) {
			
			/**this line sets the head of the doubly linked list to reference the newly created
			node ("node")
			
			head is now pointing to the same memory location as "node"
			**/
			head = node;
			tail = node;
			
		}
		
		else {
			
			//link new node to the current head
			node.next = head;
     		head.prev = node;
		    head = node;
			//System.out.println(head.prev.data);
			
		}
		
		//System.out.println (node.data);
		
	}

	public void Search (int value) {
		
		Node current = head;
		while (current != null) {
			
			if (current.data == value) {
				
				System.out.println("oh yes I got this now. See your value: " + value );
				
				break;
			}
			
		}
	}
}
