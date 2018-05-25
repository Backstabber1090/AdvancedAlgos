package com.sood.vaibhav.webcrawler;

import java.util.List;
import java.util.Queue;

public class App {

public static void main(String[] args){
	WebCrawler wc= new WebCrawler();
	String url = "https://www.google.com";
	wc.dicoveredWebisiteList(url);
	
	
}
}
