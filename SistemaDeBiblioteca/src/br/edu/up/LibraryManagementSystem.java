package br.edu.up;

public class LibraryManagementSystem {

    public static void main(String[] args) {
        User user = new User();
        
        LibraryService service = new LibraryService();

        IBorrowable book = service.emprestar(new BookFactory("22"));
        IBorrowable magazine = service.emprestar(new MagazineFactory());
        IBorrowable digitalMidia = service.emprestar(new DigitalMidiaFactory());

        user.borrow(book);
        user.borrow(magazine);
        user.borrow(digitalMidia);

        user.returnItem(book);
        user.returnItem(magazine);
        user.returnItem(digitalMidia);
    }
}
