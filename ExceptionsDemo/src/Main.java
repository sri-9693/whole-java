
public class Main {

	public static void main(String[] args) 
	{
       		
          BookStore bs = new BookStore("ABC Store","Hyderabad",new Book[5]);
          bs.AddBook(new Book(567,"abc","ery",789,"abcd"));
          bs.AddBook(new Book(1,"You can win","Shiv khera",315,"motivation"));
          bs.AddBook(new Book(2,"Half girlfriend","Thomson",420,"Friendship"));
          bs.AddBook(new Book(3,"Naruto","Vathsa",385,"Manga"));
          bs.AddBook(new Book(4,"RRR","SS.Rajamouli",1050,"Freedom"));
          
        
          bs.ShowAllBooks();
          bs.ShowBookbyCategory("abcd");
          System.out.println(bs.SearchBookbyTitle("RRR"));
         
	    
	}

}