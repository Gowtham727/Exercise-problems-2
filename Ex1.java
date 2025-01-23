package exercisee_problems2;
class Book{
	private String title;
	private String author;
	private int price;
	void method(String title,String author,int price)
	{
		this.title=title;
		this.author=author;
		this.price=price;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
public class Ex1 {

	public static void main(String[] args) {
		Book book=new Book();
		book.method("Ramayana","Kambar",1000);
		System.out.println("the author name is: "+book.getAuthor());
		System.out.println("the book is:"+book.getTitle());
		System.out.println("the book price is: "+book.getPrice());
		

	}

}
