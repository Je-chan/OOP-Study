package ch22;

import ch21.Book;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Book> library = new ArrayList<>();

        for(int i = 0 ; i < 5 ; i++) {
            library.add(new Book("태백산맥" + (i + 1), "조정래"));
        }

        for (Book book : library) {
            book.showInfo();
        }
    }
}
