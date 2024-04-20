public class BookProduct extends product {
    String author;
    String publisher;
    BookProduct(String author, String publisher,  int productid, float price, String name){
        super(productid, name, price);
        this.author=author;
        this.publisher=publisher;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPublisher() {
        return publisher;
    }
}