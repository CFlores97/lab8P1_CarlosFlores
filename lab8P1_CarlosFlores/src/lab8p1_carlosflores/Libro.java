
package lab8p1_carlosflores;



public class Libro {
    
    private String bookTitle;
    private String authorName;
    private int year;
    
    // constructor vacio
    public Libro(){
        
    }

    // contructor con atributos
    public Libro(String bookTitle, String authorName, int year) {
        this.bookTitle = bookTitle;
        this.authorName = authorName;
        this.year = year;
    }
    
    // Setters
    public void setBookTitle(String bookTitle){
        this.bookTitle = bookTitle;
    }
    
    public void setAuthorName(String authorName){
        this.authorName = authorName;
    }
    
    public void setYear(int year){
        this.year = year;
    }
    
    // Getters
    
    public String getBookTitle(){
        return this.bookTitle;
    }
    
    public String getAuthorName(){
        return this.authorName;
    }
    
    public int getYear(){
        return this.year;
    }
    
    
    
    
    
    
    
    
}
