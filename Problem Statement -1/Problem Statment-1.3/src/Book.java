public class Book {
	String book_tittle;
	double book_price;
	
	public Book(String book_tittle, double book_price)
	{
		this.book_tittle= book_tittle;
		this.book_price = book_price;
	}
	
	public String getBook_tittle() {
		return book_tittle;
	}
	public void setBook_tittle(String book_tittle) {
		this.book_tittle = book_tittle;
	}
	public double getBook_price() {
		return book_price;
	}
	public void setBook_price(double book_price) {
		this.book_price = book_price;
	}
	
	 public void display(){
	      System.out.println("book_title: "+this.book_tittle);
	      System.out.println("book_price: "+this.book_price);
	      
	   }
	
}
