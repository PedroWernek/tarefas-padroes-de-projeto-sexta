package br.edu.up;

public class BookFactory implements IFactoryBorrowable {

    @Override
    public Borrowable create() {
        return new Book();
    }

}
