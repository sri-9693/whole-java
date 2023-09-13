
public class BookStore 
{
    String storename;
	String location;
	Book[] books;
	int index=0;
	public BookStore()  {}
	public BookStore(String storename, String location, Book[] books) 
	{
		this.storename = storename;
		this.location = location;
		this.books = books;
	}
	public String getStorename() 
	{
		return storename;
	}
	public void setStorename(String storename) 
	{
		this.storename = storename;
	}
	public String getLocation() 
	{
		return location;
	}
	public void setLocation(String location) 
	{
		this.location = location;
	}
	public Book[] getBooks() 
	{
		return books;
	}
	public void setBooks(Book[] books)
	{
		this.books = books;
	}
	public void AddBook(Book book)
	{
		if(index<books.length)
		{
			books[index++]=book;
		}
	//	throw new BookStoreException ("no books can be added");
	}
	public boolean SearchBookbyTitle(String booktitle)
	{
		for(int i=0;i<index;i++)
		{
			if(books[i].getBooktitle()== booktitle)
				return true;
		}	
		return false;
	}
		   
	public void ShowBookbyCategory(String category)
	{
		int i;
		for( i=0;i<index;i++)
		{
			if(books[i].getCategory() == category)
				System.out.println(books[i].getCategory() +" "+ "is Found"); 
	    }
	}
	
	public void ShowAllBooks()
	{
		for(int i=0;i<index;i++)
		{
			System.out.println(books[i].getBooktitle() + books[i].getBookid() + books[i].getAuthor() + books[i].getPrice() + books[i].getCategory());
		}
	}
	
	
	}
	
    

