package br.edu.up;

public class DigitalMidiaFactory implements ILibraryFactory {

    @Override
    public Borrowable create() {
        return new DigitalMedia();
    }

}
