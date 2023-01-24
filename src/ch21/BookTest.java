package ch21;

public class BookTest {
    public static void main(String[] args) {
        Book[] library = new Book[5];

//        for(int i = 0 ; i < library.length ; i++) {
//            System.out.println(library[i]); // => null (null 로 초기화 되고, 메모리를 받을 공간만 마련하게 됨)
//        }

        for(int i = 0 ; i < library.length ; i++) {
            library[i] = new Book("태백산맥" + (i + 1), "조정래");
        }

        for(Book book : library) {
            // 주소는 다 다르게 잡힌다
            System.out.println(book);
            book.showInfo();
        }
    }
}
