package by.htp.library;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainApp {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		Date date1 = df.parse("13-01-2001");
		Date date2 = df.parse("06-06-1903");
		Date date3 = df.parse("06-06-1903");
		Date date4 = df.parse("06-06-1903");
		Date date5 = df.parse("06-06-1903");

		Author auth1 = new Author("NameAuthor1", "SurnameAuthor1", date1);
		Author auth2 = new Author("NameAuthor2", "SurnameAuthor2", date2);
		Author auth3 = new Author("NameAuthor3", "SurnameAuthor3", date3);
		Author auth4 = new Author("NameAuthor4", "SurnameAuthor4", date4);
		Author auth5 = new Author("NameAuthor5", "SurnameAuthor5", date5);
		
		
		Book book1 = new Book("Book1", 2006);
		Book book2 = new Book("Book2", 1950);
		Book book3 = new Book("Book3", 2017);
		Book book4 = new Book("Book4", 1945);
		Book book5 = new Book("Book5", 2010);
		
		book1.addAuthor(auth1);
		book2.addAuthor(auth1);
		book2.addAuthor(auth2);
		book3.addAuthor(auth3);
		book3.addAuthor(auth1);
		book4.addAuthor(auth4);
		book5.addAuthor(auth5);
	
		Book[] books = new Book[]{book1, book2, book3, book4, book5};
		Library lib = new Library(books);
		
		lib.bubleSortByBookDateAsc();
		lib.printBooks();
		
		System.out.println();
		lib.deleteBook(book5);
		lib.printBooks();
		
		System.out.println();
		lib.searchBookByAuthor(auth1);	
		
	}

}