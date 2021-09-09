
public class BreadthFirstSearch {

	public static void main(String[] args) {
		
		
	Node DFW = new Node("DFW"); 	
	Node JFK = new Node("JFK"); 	
	Node LAX = new Node("LAX"); 	
	Node HNL = new Node("HNL"); 	
	Node SAN = new Node("SAN"); 	
	Node EWR = new Node("EWR"); 	
	Node BOS = new Node("BOS"); 	
	Node MIA = new Node("MIA"); 	
	Node MCO = new Node("MCO"); 	
	Node PBI = new Node("PBI"); 	
		
	Graph graph = new Graph(DFW);
	graph.add(JFK);
	graph.add(LAX);
	graph.add(HNL);
	graph.add(SAN);
	graph.add(EWR);
	graph.add(BOS);
	graph.add(MIA);
	graph.add(MCO);
	graph.add(PBI);
	
	DFW.connect(LAX);
	DFW.connect(JFK);
	LAX.connect(HNL);
	LAX.connect(EWR);
	LAX.connect(SAN);
	JFK.connect(BOS);
	JFK.connect(MIA);
	MIA.connect(MCO);
	MCO.connect(PBI);
	MIA.connect(PBI);
	
	graph.routeFromAtoB(HNL, BOS);
	} 
}
