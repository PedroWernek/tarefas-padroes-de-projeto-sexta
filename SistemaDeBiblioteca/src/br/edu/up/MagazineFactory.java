package br.edu.up;

public class MagazineFactory implements ILibraryFactory {

    @Override
    public Borrowable create() {
        return new Magazine();
    }

}
