package part2.ch21;

public class ObjectCopyTest {
    public static void main(String[] args) {
        Book[] library = new Book[5];
        Book[] copiedLibrary = new Book[5];
        Book[] deepCopiedLibrary = new Book[5];



        for(int i = 0 ; i < library.length ; i++) {
            library[i] = new Book("태백산맥" + (i + 1), "조정래");
        }

        System.out.println("======== Origin ========");
        for(Book book : library) {
            System.out.println(book);
            book.showInfo();
        }

        // 얕은 복사를 한다
        System.arraycopy(library, 0, copiedLibrary, 0, 5);

        System.out.println("======== Copied ========");
        for(Book book : copiedLibrary) {
            // Origin 과 주소가 겹친다
            System.out.println(book);
            book.showInfo();
        }

        // 깊은 복사를 한다 (사실상 참조 데이터의 주소가 아니라 새 주소를 만들고 거기에 동일한 원시 타입의 값을 넣는 것)
        for(int i = 0 ; i <library.length ; i++) {
            deepCopiedLibrary[i] = new Book();
            deepCopiedLibrary[i].setAuthor(library[i].getAuthor());
            deepCopiedLibrary[i].setTitle(library[i].getTitle());
        }

        System.out.println("====== deepCopied ======");
        for(Book book : deepCopiedLibrary) {
            System.out.println(book);
            book.showInfo();
        }
    }
}
