package src3;

public class Book {
	private String name;
	private String author;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String toString() {
		return "제목: "+name+"\t지은 이:"+author;
	}
	
	
}
