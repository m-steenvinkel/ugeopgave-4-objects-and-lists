package Opgave5;

public class Book {
    private String title;
    private String author;
    private boolean available;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.available = true;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void borrow() {
        if (this.available) {
            this.available = false;
            System.out.println("You have borrowed: " + this.title);
        }
    }

    public void returnBook() {
        this.available = true;
        System.out.println("You have returned: " + this.title);
    }

    public String toString() {
        return "Title: " + this.title + " Author: " + this.author + "Available: " + this.available;
    }



}
