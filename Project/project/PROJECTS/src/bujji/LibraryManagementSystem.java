package bujji;

import java.util.ArrayList;
import java.util.Scanner;

class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}

public class LibraryManagementSystem {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(String title, String author) {
        books.add(new Book(title, author));
        System.out.println("Book added successfully.\n");
    }

    public void searchBook(String title) {
        boolean found = false;
        for (Book book : books) {
            if (book.title.equalsIgnoreCase(title)) {
                System.out.println("Book Found:");
                System.out.println("Title: " + book.title);
                System.out.println("Author: " + book.author + "\n");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Book not found.\n");
        }
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.\n");
        } else {
            System.out.println("Books in the Library:");
            for (int i = 0; i < books.size(); i++) {
                Book book = books.get(i);
                System.out.println((i + 1) + ". Title: " + book.title + ", Author: " + book.author);
            }
            System.out.println();
        }
    }

    public void removeBook(String title) {
        boolean removed = false;
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).title.equalsIgnoreCase(title)) {
                books.remove(i);
                System.out.println("Book removed successfully.\n");
                removed = true;
                break;
            }
        }
        if (!removed) {
            System.out.println("Book not found.\n");
        }
    }

    public static void main(String[] args) {
        LibraryManagementSystem library = new LibraryManagementSystem();
        Scanner a = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Library Management System");
            System.out.println("1. Add a New Book");
            System.out.println("2. Search for a Book by Title");
            System.out.println("3. Display All Books");
            System.out.println("4. Remove a Book by Title");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            choice = a.nextInt();
            a.nextLine(); // consume the newline

            switch (choice) {
                case 1:
                    System.out.print("Enter the book title: ");
                    String title = a.nextLine();
                    System.out.print("Enter the book author: ");
                    String author = a.nextLine();
                    library.addBook(title, author);
                    break;

                case 2:
                    System.out.print("Enter the book title to search: ");
                    String searchTitle = a.nextLine();
                    library.searchBook(searchTitle);
                    break;

                case 3:
                    library.displayBooks();
                    break;

                case 4:
                    System.out.print("Enter the book title to remove: ");
                    String removeTitle = a.nextLine();
                    library.removeBook(removeTitle);
                    break;

                case 5:
                    System.out.println("Exiting system...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.\n");
            }
        } while (choice != 5);

        a.close();
    }
}
