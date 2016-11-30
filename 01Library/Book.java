public class Book{
    private String author; String title; String ISBN;

    public Book(){
    }
    public Book(String title, String author, String ISBN){
	setTitle(title);
	setAuthor(author);
	setISBN(ISBN);
    }

    public String getAuthor(){
	return author;
    }
    public String getTitle(){
	return title;
    }
    public String getISBN(){
	return ISBN;
    }

    public void setAuthor(String author){
	this.author = author;
    }
    public void setTitle(String title){
	this.title = title;
    }
    public void setISBN(String ISBN){
	this.ISBN = ISBN;
    }

    public String toString(){
	return getTitle()+", "+getAuthor()+", "+getISBN();
    }
}
