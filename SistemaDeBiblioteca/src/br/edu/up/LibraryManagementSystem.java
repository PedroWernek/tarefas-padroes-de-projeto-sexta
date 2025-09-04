package br.edu.up;

public class LibraryManagementSystem {

    public static void main(String[] args) {
        User user = new User();
        Borrowable book = new BookFactory().create();
        Borrowable magazine = new MagazineFactory().create();
        Borrowable digitalMidia = new DigitalMidiaFactory().create();

        user.borrow(book);
        user.borrow(magazine);
        user.borrow(digitalMidia);

        user.returnItem(book);
        user.returnItem(book);
        user.returnItem(book);
    }
}
