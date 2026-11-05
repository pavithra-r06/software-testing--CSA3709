// Library Management System - Test Case
import java.util.*;

class LibraryTest {
    public static void main(String[] args) {
        HashMap<String, Boolean> books = new HashMap<>();
        books.put("Python", true);
        books.put("Java", false);
        books.put("C++", true);

        String book = "Python";
        if (books.containsKey(book) && books.get(book)) {
            books.put(book, false);
            System.out.println("Book Issued Successfully");
        } else {
            System.out.println("Book is Unavailable");
        }

        books.put(book, true);
        System.out.println("Book Returned Successfully");
    }
}
