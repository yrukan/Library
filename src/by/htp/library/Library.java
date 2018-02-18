package by.htp.library;

public class Library {

	private Book[] library;
	private int booksCounter;
	
	public Library(){
		
	}
	
	public Library(Book[] library){
		this.library = library;
	}
	
	public void setLibrary(Book[] library){
		this.library = library;
	}
	
	public Book[] getLibrary(Book[] library){
		return this.library;
	}

	public void addBook(Book book){		  
			if(this.library != null){
	    		if(booksCounter < this.library.length){
	    			this.library[booksCounter] = book;
	    			booksCounter++;   			
	    		}else{
	    			Book[] newlibrary = new Book[this.library.length + 1];
	    			for(int i=0; i<this.library.length; i++){
	    				newlibrary[i] = this.library[i];    				
	    			}
	    			this.library = newlibrary;
	    			this.library[booksCounter] = book;
	    			booksCounter++;	    			
	       		}
	    	}
	    	else {
	    		this.library = new Book[5];
	    		this.library[0] = book;
	    		booksCounter++;	    		
	    	    }
	}
	
	public void deleteBook(Book book){
		int count=0;
    		for(int i=0; i<this.library.length; i++){
    		   if(this.library[i] == book){
    			  for(int j=i; j<this.library.length-1; j++)
    			      this.library[j] = this.library[j+1];
    			  count++;
    		   }
    	    }
    	Book[] newlibrary = new Book[this.library.length-count];
    		
			for(int i=0; i<this.library.length-count; i++)
				newlibrary[i] = this.library[i];    				
			this.library = newlibrary;
			booksCounter = this.library.length;
    				
    }
	
	public void printBooks(){
		System.out.println("Library: ");
		Book[] b = this.library; 
		for(int i = 0; i<b.length; i++){
			System.out.println(i+1 + ". Book name: " + b[i].getTitle() + " Date: " + b[i].getYear() + " Authors: " + b[i].getBookAuthors());
		}
	}
	
	public void bubleSortByBookDateAsc(){
		    Book b;			
			for(int i = 0; i< this.library.length; i++){
				for(int j=1; j<this.library.length - i; j++){
				    if(this.library[j-1].getYear() > this.library[j].getYear()){
				    	b = this.library[j-1];
				    	this.library[j-1] = this.library[j];
				    	this.library[j] = b;
				    }
				}
				
			}
		}

	public void searchBookByAuthor(Author auth){
	    Author[] a;
	    int flag = 0;
	    System.out.println("Search results for author " + auth.getAuthorName() + " " + auth.getAuthorSurname() + " : ");
		for(int i = 0; i< this.library.length; i++){
			a = this.library[i].getAuthors();
			for(int j = 0; j < this.library[i].getAuthors().length; j++){
			    if(a[j] == auth){
			    	Book b = this.library[i];
			    	System.out.println(i+1 + ". Book name: " + b.getTitle() + " Date: " + b.getYear() + " Authors: " + b.getBookAuthors());
			    	flag++;
			    }
			}	
		}
		if(flag == 0)
			System.out.println("No resuts found");
	}


}

