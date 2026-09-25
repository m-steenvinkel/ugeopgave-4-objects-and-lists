package Opgave5;

public class Main {

    public static void main(String[] args) {
        Library library = new Library("Gentofte Bibliotek");

        library.addBook(new Book("1984", "George Orwell"));
        library.addBook(new Book("Harry Potter", "J.K. Rowling"));
        library.addBook(new Book("Ringenes Herre", "J.R.R. Tolkien"));
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee"));
        library.addBook(new Book("Pride and Prejudice", "Jane Austen"));
        System.out.println();


        library.printAllBooks();

        Book book1 = library.findBookByTitle("1984");
        if (book1 != null) {
            book1.borrow();
        }

        Book book2 = library.findBookByTitle("Harry Potter");
        if (book2 != null) {
            book2.borrow();
        }

        System.out.println("Available books:");
        for (Book book : library.findAvailableBooks()) {
            System.out.println(book);
        }

        if (book1 != null) {
            book1.returnBook();
        }

        if (book2 != null) {
            book2.returnBook();
        }

        library.printAllBooks();


    }



}
