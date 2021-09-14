import java.util.*;

public class Graph {
	ArrayList<Node> nodes = new ArrayList<>();
	LinkedList<Node> visitedNodes = new LinkedList<>();
	ArrayList<Node> route = new ArrayList<>();
	Queue<Node> queue = new LinkedList<>();
	
	Graph (Node node){
		this.nodes.add(node);
	}
	
	public void add(Node node) {
		this.nodes.add(node);
	}
	
	private void breadthFirstSearch (Node start, Node target){
		Node curr = start;
		//System.out.println(curr);
		visitedNodes.add(curr);
		
		if (curr.val.equals(target.val)) {
			System.out.println("Here it is!");
			return;
		}
		
		for (Node neighbour: curr.edgeList) {
			if (!visitedNodes.contains(neighbour)) {
				queue.add(neighbour);
				if(neighbour.parent == null) {
					neighbour.parent = curr;
				}
			}
		}
			
		breadthFirstSearch (queue.remove(), target);		
	}
	
	public void routeFromAtoB (Node A, Node B) {
		breadthFirstSearch (A, B);
		findRoute(B);
		
		//reserve order
//		for(Node node: route) {
//			System.out.println(node.val);
//		}
		
		for(int i = route.size()-1; i >= 0; i--) {
			System.out.println(route.get(i).val);
		}
	}

	private void findRoute(Node target) {
		route.add(target);
		if (target.parent == null) {
			return;
		}
		findRoute(target.parent);
	}
}
