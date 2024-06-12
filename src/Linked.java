
public class Linked {
	Node head;
	
	public void insert(int data) {
		
		Node node = new Node();
		node.data = data;
		
		node.next = null;
		
		if(head == null) {
			
			head = node;
			
			System.out.print(head);
		}
		
		else {
			
			Node n = head;
		}
		
		
	}

}
