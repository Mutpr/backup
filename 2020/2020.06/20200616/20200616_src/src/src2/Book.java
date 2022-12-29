package src2;

public class Book {
	private String name;
	private String page;
	private String author;
	
	public Book(String name, String page, String author) {
		//초기화 생성자 매개변수 
		this.name = name;
		this.page = page;
		this.author = author;
		//필드로 초기화
	}

	public Book() {
		//default 생성자 
		this(null, null, null); //중량의 값을 전부 0으로 초기화 
		//같은 클래스에서 오버로딩 된 생성자를 초기화
	}
	
	//설정자 메소드 : setter 메소드
	public void setName(String name) {
		this.name = name;
	}
	//접근자 메소드: getter 메소드
	public String getName() {
		return name;
	}
	
	public void setPage(String page) {
		this.page = page;
	}
	
	//접근자 메소드: getter 메소드
	public String getPage() {
		return name;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	//접근자 메소드: getter 메소드
	public String getAuthor() {
		return author;
	}
	
	
	@Override
	public String toString() {
		return "책 이름: "+ name+"\n 페이지 수: "+page+"\n 작가: "+author+"\n ";
		//cost 와 kg의 가격과 중량?
	}
}
