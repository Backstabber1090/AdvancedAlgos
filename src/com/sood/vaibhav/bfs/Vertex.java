package com.sood.vaibhav.bfs;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

	private List<Vertex>  neighbourList;
	private boolean visited=false;
	private int data ; 
	
	protected Vertex(){
		
		
	}
public Vertex( int data){
		this.data = data;
		neighbourList = new ArrayList<>();
	}
public List<Vertex> getNeighbourList() {
	return neighbourList;
}
public void setNeighbourList(List<Vertex> neighbourList) {
	this.neighbourList = neighbourList;
}
@Override
public String toString() {
	return "Vertex [neighbourList=" + neighbourList + ", visited=" + visited + ", data=" + data + "]";
}
public boolean isVisited() {
	return visited;
}
public void addNeighbour(Vertex vertex){
	
	neighbourList.add(vertex);
}

public void setVisited(boolean visited) {
	this.visited = visited;
}
public int getData() {
	return data;
}
public void setData(int data) {
	this.data = data;
}
	
	
}
