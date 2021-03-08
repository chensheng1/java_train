package test3;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;



import test3.BFS.Node;

public class BFS {

	public static class Node{
		List neighbors;
		Node pathparents;
		String name;
		
		public Node(String name){
			this.name=name;
			neighbors= new LinkedList();
		}
		public String toString(){  //
			return name;
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Node nodeA = new Node("A");  
	        Node nodeB = new Node("B");  
	        Node nodeC = new Node("C");  
	        Node nodeD = new Node("D");  
	        Node nodeE = new Node("E");  
	        Node nodeF = new Node("F");  
	        Node nodeG = new Node("G");  
	        Node nodeH = new Node("H");  
	          
	/* 
	 * Construct Trees 
	 */  
	        nodeA.neighbors.add(nodeC);  
	        nodeA.neighbors.add(nodeD);  
	        nodeA.neighbors.add(nodeE);  
	        nodeB.neighbors.add(nodeE);  
	        nodeC.neighbors.add(nodeA);  
	        nodeC.neighbors.add(nodeD);  
	        nodeC.neighbors.add(nodeF);  
	        nodeD.neighbors.add(nodeA);  
	        nodeD.neighbors.add(nodeC);  
	        nodeE.neighbors.add(nodeA);  
	        nodeE.neighbors.add(nodeB);  
	        nodeE.neighbors.add(nodeG);  
	        nodeF.neighbors.add(nodeC);  
	        nodeF.neighbors.add(nodeH);  
	        nodeG.neighbors.add(nodeE);  
	        nodeH.neighbors.add(nodeC);  
	        nodeH.neighbors.add(nodeF);  
	          
	        BFS cs = new BFS();  
	        System.out.println("From A to B:" + cs.search(nodeA,nodeF));  
	}

	public List search(Node strat,Node goal){
		LinkedList closedList=new LinkedList();
		LinkedList opendList= new LinkedList();
		opendList.add(strat);
		strat.pathparents=null;
		while(!opendList.isEmpty()){
			Node node= (Node) opendList.removeFirst();
			if(node == goal){
				return constructPath(closedList);
			}else{
				closedList.add(node);
				Iterator i = node.neighbors.iterator();
				while( i.hasNext()){
					Node neighborsnode=(Node) i.next();
					if (!closedList.contains(neighborsnode)&&!opendList.contains(neighborsnode)){
					    neighborsnode.pathparents=node;	
					    opendList.add(neighborsnode);
					}
				}
			}
		}
		return null;
		
	}
	public List constructPath(LinkedList list){
		    System.out.println("广度优先路径：" + list.toString());
	  
		return list;
	}
}
