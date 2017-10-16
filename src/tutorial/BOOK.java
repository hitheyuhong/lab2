package tutorial;

public class BOOK {
	public String ISBN;
    public String Title;
    public String AuthorID;
    public String Publisher;
    public String PublishDate;
    public String Price;
    
     
    public BOOK(String ISBN,String Title,String AuthorID ,String Publisher,String PublishDate,String price ){
    	this.ISBN = ISBN;
    	this.Title = Title;
    	this.AuthorID = AuthorID;
    	this.Publisher = Publisher;
    	this.PublishDate = PublishDate;
    	this.Price = price;
    	 
    }
    public BOOK(){
    }
    public String getISBN(){
    	return ISBN;
    }
    public void setISBN(String ISBN){
    	this.ISBN=ISBN;
    }
    public String getTitle(){
    	return Title;
    }
    public void setTitle(String Title){
    	this.Title=Title;
    }
    public String getAuthorID(){
    	return AuthorID;
    }
    public void setAuthorID(String AuthorID){
    	this.AuthorID=AuthorID;
    }
    public String getPublisher(){
    	return Publisher;
    }
    public void setPublisher(String Pushlisher){
    	this.Publisher=Pushlisher;
    }
    public String getPrice(){
    	return Price;
    }
    public void setPrice(String Price){
    	this.Price=Price;
    }
    public String getPublishDate(){
    	return PublishDate;
    }
    public void setPublishDate(String PublishDate){
    	this.PublishDate=PublishDate;
    }
    
 
}
