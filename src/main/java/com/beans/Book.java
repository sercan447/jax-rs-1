
package com.cokelek.beans;


public class Book {
    
    private String ISBN;
    private String name;
    private String author;
    private String publisher;
    private int stockQty;
    private double price;
    
    public Book(){}

    public Book(String ISBN, String name, String author, String publisher, int stockQty, double price) {
        this.ISBN = ISBN;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.stockQty = stockQty;
        this.price = price;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getStockQty() {
        return stockQty;
    }

    public void setStockQty(int stockQty) {
        this.stockQty = stockQty;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" + "ISBN=" + ISBN + ", name=" + name + ", author=" + author + ", publisher=" + publisher + ", stockQty=" + stockQty + ", price=" + price + '}';
    }
    
   
    
    
}
