package by.htp.library;

public class Book {

	private String title;
	private int year;
	private Author[] authors;
	private int authorCounter;

	public Book() {

	}

	public Book(String title, int year) {
		this.title = title;
		this.year = year;
	}

	public void setAuthors(Author[] authors) {
		if (authors != null) {
			this.authors = authors;
		}
	}

	public Author[] getAuthors() {
		return this.authors;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return this.title;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getYear() {
		return this.year;
	}

	public void addAuthor(Author author) {

		if (this.authors != null) {
			if (authorCounter < authors.length) {
				authors[authorCounter] = author;
				authorCounter++;
			}else{
				Author[] authors = new Author[this.authors.length + 10];
				
				for(int i = 0; i <this.authors.length; i++){
					authors[i] = this.authors[i];
				}
				this.authors = authors;
				this.authors[authorCounter] = author;
				authorCounter++;
			}
		} else {
			this.authors = new Author[2];
			this.authors[authorCounter] = author;
			authorCounter++;
		}
	}
	
	public String getBookAuthors(){
		String s = "";
		int i = 0;
		while(i < this.authorCounter){
			s = s + this.authors[i].getAuthorName() + " " + this.authors[i].getAuthorSurname() + ", ";
			i++;
		}
		return s;
	}
	
}
