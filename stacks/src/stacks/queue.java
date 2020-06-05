package stacks;

public class queue {
	class Node
	{
	    int data;     
	    Node next;   
	 	    public Node(int data)
	 	    {
	        this.data = data;
	        this.next = null;
	    }
	}
	  private Node rear = null;
		private  Node front = null;
	    public int dequeue()    
	    {
	        if (front == null) {
	            System.exit(1);
	        }
	 
	        Node temp = front;
	       System.out.printf("Removing", temp.data);
	         front = front.next;
	        if (front == null) {
	            rear = null;
	        }
	        int item = temp.data;
	        return item;
	    }
	 	    public void enqueue(int item)    
	    {
	        Node node = new Node(item);
	        System.out.printf("Inserting ", item);
	        if (front == null) {
	            front = node;
	            rear = node;
	        } else {
	            rear.next = node;
	            rear = node;
	        }
	    }
	    public int peek() {
	        if (front != null) {
	            return front.data;
	        } else {
	            System.exit(1);
	        }
	 
	        return -1;
	    }
	 
	    public boolean isEmpty() {
	        return rear == null && front == null;
	    }
	
	public   static  void main(String[] args) {
		  queue u= new queue();
	        u.enqueue(1);
	        u.enqueue(2);
	        u.enqueue(3);
	        u.enqueue(4);        
	        System.out.printf("Front element is %d\n", u.peek());
	u.dequeue();
	        u.dequeue();
	        u.dequeue();
	        u.dequeue();
	 
	        if (u.isEmpty()) {
	            System.out.println("Queue is empty");
	        } else {
	            System.out.print("Queue is not empty");
	        }

	}
}
