public class Library {



    // Fields

    public String name; // Instance field for the name of the library

    public static int totalBooks = 0; // Static field to track the total number of books



    // Method to add books to the library and increase the totalBooks static field

    public void addBooks(int numBooks) {

        totalBooks += numBooks; // Increase the total books across all libraries

    }



    // Static method to get the total number of books across all libraries

    public static int getTotalBooks() {

        return totalBooks;

    }

}




public class App {

    public static void main(String[] args) {

        // Create Library A

        Library A = new Library();

        A.name = "Library A";

        A.addBooks(100);



        // Create Library B and add 150 books

        Library B = new Library();

        B.name = "Library B";

        B.addBooks(150);



        // Display the total number of books across all libraries

        System.out.println("Total books in all libraries: " + Library.getTotalBooks());

    }

}

