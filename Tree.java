
public class Tree {
	
	private static Node head=null;
	
	public static void add(Node n){
		
		Node curr;
		Node par;
		
		if(head==null)
			head = n;
		
		else{
		
		curr = head;
		
		while(true){
		if(n.num<curr.num && curr.left!=null)
			curr = curr.left;
		
		if(n.num<curr.num && curr.left==null){
			par=curr;
			break;
		}
		
		if(n.num>curr.num && curr.right!=null)
			curr = curr.right;
		
		if(n.num>curr.num && curr.right==null){
			par=curr;
			break;
		}
				
		}
			
		if(par.left==null)
			par.left=n;
		else
			par.right=n;
	}

	}
	
	public static void inOrder(Node n){
		
		if(n!=null){
		inOrder(n.left);
		System.out.print(n.num+"->");
		inOrder(n.right);
		}
		
	}
	
	public static void preOrder(Node n){
		
		if(n!=null){
			System.out.print(n.num+"->");
			preOrder(n.left);
			preOrder(n.right);
			}	
		
	}
	
	public static void postOrder(Node n){
		
		if(n!=null){
			postOrder(n.left);
			postOrder(n.right);
			System.out.print(n.num+"->");

		}	
		
	}
	
	public static void main(String args[]){
		
		Node n = new Node(10);
		Node n1 =  new Node(1);
		Node n2= new Node(20);
		
		add(n);
		add(n1);
		add(n2);
		
		inOrder(n);
		System.out.println("\n");
		preOrder(n);
		System.out.println("\n");
		postOrder(n);
		
	}
	
}
