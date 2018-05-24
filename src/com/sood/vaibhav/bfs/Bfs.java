package com.sood.vaibhav.bfs;

import java.util.LinkedList;
import java.util.Queue;

public class Bfs {

	public void Bfsim(Vertex root){
		System.out.println("in implementation");
		Queue<Vertex> queue  = new LinkedList<>();
		root.setVisited(true);
		queue.add(root);
		
		while (!queue.isEmpty()){
			Vertex v  = queue.remove();
		System.out.print(v.getData()+ ",");
		for (Vertex n : v.getNeighbourList()){
			if (!n.isVisited()){
				n.setVisited(true);
				queue.add(n);
			}
		}
			
			
		}
		
	}
	
	
}
