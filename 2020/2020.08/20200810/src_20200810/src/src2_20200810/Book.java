package src2_20200810;

public class Book {
	private String title;
	private int page;
	private String author;
	
	public Book(String ti, int pa, String aut) {
		title = ti;
		page = pa;
		author = aut;
	}
	
	
	public void BookInfo() {
		System.out.println("제목: "+title);
		System.out.println("페이지 수:"+page);
		System.out.println("저자: "+author);
	}
}
