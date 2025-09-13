package br.edu.up;

public class LibraryService {
    
    public IBorrowable emprestar(IFactoryBorrowable factory){
        IBorrowable borrowable = factory.create();
        return borrowable;
    }
}
