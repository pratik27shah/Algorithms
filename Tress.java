/**
 * 
 */
package trees;

import java.awt.List;
import java.util.ArrayList;
import java.util.Stack;

/**
 * @author PRATIK SHAH
 *
 */
public class Tress {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Add a=new Add();

	}

}

class Add {

	public Add()
	{
		Node root =new Node();
		root.SetParent(null);
		root.Setid("root");
		Node node1=new Node();
		node1.Add(root,"id2","r");
		Node node2=new Node();
		node2=node2.Add(root,"id1","l");
		Node node3=new Node();
		node3.Add(node2, "child","r");
		
		Display(root);
	}

	private void Display(Node root) {
		Node rootnode=root,temp;
		System.out.println("root node\n"+rootnode.getId().toString());
		Stack<Node> stack=new Stack();
		stack.push(rootnode);
	while(!stack.isEmpty()){
		
		Node nodes=stack.pop();
		if(!nodes.getLeftchild().isEmpty()){
			temp=nodes.getLeftchild().remove(0);
			System.out.println(temp.getId().toString());
			stack.push(temp);
		}
		
		if(!nodes.getRightchild().isEmpty()){
			temp=nodes.getRightchild().remove(0);
			System.out.println(temp.getId().toString());
			stack.push(temp);
		}
		
		
	}
		
	}

}

class Node {
	String id;
	ArrayList<Node> Leftchild = new ArrayList<>();
	ArrayList<Node> Rightchild = new ArrayList<>();
	Node parent;

	public void SetParent(Node parent) {
		this.parent = parent;

	}

	public void Setid(String id) {
		this.id = id;
	}

	public Node getParent() {
		return this.parent;
	}

	public String getId() {

		return this.id;
	}

	public ArrayList<Node> getLeftchild() {
		return Leftchild;

	}
	
	public ArrayList<Node> getRightchild() {
		return Rightchild;

	}


	
	public Node  Add(Node parent, String id,String param) {
Node node=new Node();
node.SetParent(parent);
node.Setid(id);
if(param.toLowerCase()!="r")
parent.getLeftchild().add(node);
else
	parent.getRightchild().add(node);
return node;
	}
}