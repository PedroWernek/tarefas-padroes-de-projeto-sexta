package br.edu.up;

public class Book extends LibraryItem {

    public String genre;

    public void readSample() {
        System.out.println(super.title + "\nAuthor:" + super.author + "\nPublication Year:" + super.publicationYear + "Genre:" + this.genre);
    }

    @Override
    public void borrow(Borrowable item, User user) {
        user.borrowedItems.add(item);
    }

    @Override
    public void returnItem(Borrowable item, User user) {
        user.borrowedItems.remove(user.borrowedItems.indexOf(item));
    }

}
