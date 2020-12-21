package br.com.erudio;

public class Greeting {
	
	private final long id;
	private final String content;
	
	//constructor
	public Greeting(long id, String content) {
		
		this.id = id;
		this.content = content;
	}
	
	//getters
	public long getId() {
		return id;
	}
	public String getContent() {
		return content;
	}
	
	
	
}
