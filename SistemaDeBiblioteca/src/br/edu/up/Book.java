package br.edu.up;

public class Book extends AbsLibraryItem {
    public String bookId;
    public String genre;

    public Book(String bookId){
        this.bookId = bookId;

        if(this.bookId.equals("22")){
            this.author = "Aaa";
        }
    }

    public void readSample() {
        System.out.println(this.title + "\nAuthor:" + this.author + "\nPublication Year:" + this.publicationYear + "Genre:" + this.genre);
    }

    @Override
    public void borrow(IBorrowable item, User user) {
        user.borrowedItems.add(item);
    }

    @Override
    public void returnItem(IBorrowable item, User user) {
        user.borrowedItems.remove(user.borrowedItems.indexOf(item));
    }

}
