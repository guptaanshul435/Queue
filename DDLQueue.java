//DDL QUEUE 
class Node{
  Object data;
  Node pre, next;
 public Node(Object data){
 this.data=data;
 }
}

class DDLQueue{
	static Node front,rear;
	static Object k;
	public static void add(Object data){
		Node newNode=new Node(data);
		if(rear==null){
			rear=newNode;
			front=newNode;
		}else{
			rear.next=newNode;
			newNode.pre=rear;
			rear=newNode;
		}
	}
	public static Object remove(){
		
		if(front==null){
			System.out.println("Queue is empty");
		}else{
			k=front.data;
			front=front.next;
		}
		return k;
		
	}
	public static void dispaly(){
		
		if(front==null){
			System.out.println("Queue is empty");
		}else{
			while(front.next!=null){
			System.out.println(front.data);
			front=front.next;	
			}
			System.out.println(front.data);
		}
	}
	public static void main(String[] args){
	for(int i=0;i<11;i++){
     DDLQueue.add(i);
	}		
		System.out.println(DDLQueue.remove());
		System.out.println("After removing first element remaining data");
		System.out.println(DDLQueue.remove());
		System.out.println("After removing second element remaining data");
		DDLQueue.dispaly();
	}
}