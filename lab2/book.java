package library;

public class book extends LibraryItem{
	private int pages;
	public book(String title, String author ,int year,int pages){
	super(title,author,year);
	this.pages=pages;
	}
	@Override
	public String getItemType() {
		return "Book";
	}
	public String toString() {
        return super.toString() + " pages: " + pages;
    }
}
