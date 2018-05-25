package com.sood.vaibhav.webcrawler;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class WebCrawler {
	private Queue<String> queue;
	private List<String> discoveredWebsiteList;

	
	public WebCrawler(){
		this.queue = new LinkedList<>();
		this.discoveredWebsiteList = new ArrayList<>();
	}
	
	public void dicoveredWebisiteList(String root){
		System.out.println("discovering");
		this.queue.add(root);
		this.discoveredWebsiteList.add(root);
		while (!queue.isEmpty()){
			
			String v = this.queue.remove();
			String rawHtml = readURL(v);
			String regexp = "http://(\\w+\\.)*(\\w+)";
			Pattern pattern = Pattern.compile(regexp);
			Matcher matcher = pattern.matcher(rawHtml);
			while (matcher.find()){
				String actualURL = matcher.group();
				if(!discoveredWebsiteList.contains(actualURL)){
					discoveredWebsiteList.add(actualURL);
					System.out.println("URL has been found" + actualURL);
					queue.add(actualURL);
				}
					
			}
		}
	}

	private String readURL(String v) {
		String rawHtml = "";
		try{
			URL url = new URL(v);
			BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
			String inputline = "";
			while ((inputline = in.readLine()) !=null){
				rawHtml +=inputline;
			}
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		return rawHtml;
		
	}

}
