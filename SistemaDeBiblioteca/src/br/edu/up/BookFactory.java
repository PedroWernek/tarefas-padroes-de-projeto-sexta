package br.edu.up;

public class BookFactory implements ILibraryFactory {

    @Override
    public Borrowable create() {
        return new Book();
    }

}
