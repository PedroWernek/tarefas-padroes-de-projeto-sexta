package br.edu.up;

public class DigitalMedia extends LibraryItem {

    public String fileFormat;

    public void play() {
        System.out.println("Playing:" + super.title + this.fileFormat + "\nAuthor:" + super.author);
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
