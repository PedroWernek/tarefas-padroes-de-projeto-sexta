package br.edu.up;

public class LibraryManagementSystem {

    public static void main(String[] args) {
        User user = new User();

        Borrowable borrowable = new BookFactory().create();

    }
}
