import java.util.ArrayList;

public class Node {
	String val;
	ArrayList<Node> edgeList;
	Node parent;
	
	Node(String input){
		val = input;
		edgeList = new ArrayList<Node>();
		parent = null; 
	}
	
	public void connect (Node node) {
		this.edgeList.add(node);
		node.edgeList.add(this);
	}
	
	public ArrayList<Node> getAdjacent() {
		return this.edgeList;
	}
	
	public boolean isConnected (Node node) {
		for (Node curr : edgeList) {
			if (curr.val.equals(node.val)) {
				return true;
			}
		}
		return false;
	}
	
//	public String toString() {
//		return "\nName of the node: " + this.val /*+ "\nNeighbours: " + this.edgeList*/ + 
//				"\nParent of the node: " + this.parent.val;
//	}
}
