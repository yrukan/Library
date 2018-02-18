package by.htp.library;
import java.util.Date;

public class Author {

	String name;
	String surname;
	Date birthDate;

	public Author() {

	}

	public Author(String name, String surname, Date date) {
		this.name = name;
		this.surname = surname;
		this.birthDate = date;
	}
	
	public String getAuthorName(){
		return this.name;
	}
	
	public String getAuthorSurname(){
		return this.surname;
	}
}
