
public class Book
{
   int bookid;
   String booktitle;
   String author;
   double price;
   String category;
   public Book()  {}
public Book(int bookid, String booktitle, String author, double price, String category) 
{
	this.bookid = bookid;
	this.booktitle = booktitle;
	this.author = author;
	this.price = price;
	this.category = category;
}
public int getBookid() 
{
	return bookid;
}
public void setBookid(int bookid) 
{
	this.bookid = bookid;
}
public String getBooktitle() 
{
	return booktitle;
}
public void setBooktitle(String booktitle) 
{
	this.booktitle = booktitle;
}
public String getAuthor() 
{
	return author;
}
public void setAuthor(String author) 
{
	this.author = author;
}
public double getPrice() 
{
	return price;
}
public void setPrice(double price)
{
	this.price = price;
}
public String getCategory() 
{
	return category;
}
public void setCategory(String category)
{
	this.category = category;
}
}
