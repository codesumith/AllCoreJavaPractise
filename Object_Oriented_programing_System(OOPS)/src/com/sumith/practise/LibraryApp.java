package com.sumith.practise;
import java.util.Arrays;
class Book
{
 String title;
    String author;
    int year;
    
    public Book(String title ,String author, int year)
    {
        this.title=title;
        this.author=author;
        this.year=year;
    }
    
    public String getTitle()
    {
    	
       return title; 
    }
    
    public String getauthor()
    {
       return author; 
    }
    
    public int getyear()
    {
       return year; 
    }
    
    public void setTitle(String s)
    {
       title=s;
    }
    
    public void setauthor(String s)
    {
       author=s;
    }
    
    public void setYear(int s)
    {
       year=s;
    }
    public String toString()
    {
       return(" Book title is : "+title+", Book author is :"+author+", Book published year is :"+year);
    }
}

class LibraryCatalog{
    int n=0;
    int catalogSize;
    Book[] books ; 
    
   
    public LibraryCatalog(int maxSize)
    {
    	catalogSize  = maxSize;
    	books= new Book[catalogSize];
    }
    
    public void addBook(Book book){
    	
        if(n+1==books.length){
            System.out.println("No more books can be added");
            System.exit(0);
            
        }
        else{
        books[n]=book;
        n++;
        }
    }
        
        public void  displayCatalog()
        {
            System.out.println(Arrays.toString(books));
        }
    }

public class LibraryApp
{
    public static void main(String[] args)
    {
        //Write Code Here
        
        LibraryCatalog l =new LibraryCatalog(5);
        
        Book b1= new Book("The psycology of money","Morgan Housel",2020);
        l.addBook(b1);
        
        Book b2= new Book("The great gatsby","F. Scott Fitzgerald",1925);
        l.addBook(b2);
        
        Book b3= new Book("To kill a mockingbird","Harper Lee ",1960);
        l.addBook(b3);
        
        l.displayCatalog();
        
    }
}