package lab8p1_carlosflores;

import java.awt.print.Book;
import java.util.Scanner;

public class Lab8P1_CarlosFlores {

    static Scanner sc = new Scanner(System.in);
    static Libro[][] librero;

    public static void main(String[] args) {
        boolean running = true;

        int c = 0;

        while (running) {
            System.out.println("1. Crear Biblioteca\n2. Modificar librero\n3.Salir");
            int op = sc.nextInt();

            switch (op) {
                case 1:
                    librero = llenarLibrero();
                    c = 1;

                    break;

                case 2:

                    if (c != 0) {
                        System.out.println("\nIngrese el titulo del libro: ");
                        String bookName = sc.next();

                        // sets author
                        System.out.println("\nIngrese el escritor: ");
                        String authorName = sc.next();

                        // sets year
                        System.out.println("\nIngrese el año de publicacion: ");
                        int yearPublished = sc.nextInt();

                        printBookTitle(modificarLibro(bookName, authorName, yearPublished, librero));

                    }

                    break;

                case 3:
                    running = false;
                    break;

                default:
                    break;
            }

        }
    }

    public static Libro[][] llenarLibrero() {
        System.out.println("Ingrese la cantidad de filas para el librero: ");
        int filas = sc.nextInt();

        System.out.println("Ingrese la cantidad de columnas para el librero: ");
        int columnas = sc.nextInt();

        while (filas < 1 || columnas < 1) {
            System.out.println("Ingrese la cantidad de filas para el librero: ");
            filas = sc.nextInt();

            System.out.println("Ingrese la cantidad de columnas para el librero: ");
            columnas = sc.nextInt();
        }

        Libro[][] librero = new Libro[filas][columnas];

        for (int i = 0; i < librero.length; i++) {
            for (int j = 0; j < librero[i].length; j++) {

                // sets book title
                System.out.println("\nIngrese el titulo del libro: ");
                String bookTitle = sc.next();

                // sets author
                System.out.println("\nIngrese el escritor: ");
                String author = sc.next();

                // sets year
                System.out.println("\nIngrese el año de publicacion: ");
                int year = sc.nextInt();

                Libro book = new Libro(bookTitle, author, year);
                librero[i][j] = book;

                System.out.println("\nEl libro se agrego exitosamente!");

            }

        }

        // imprimir libros
        printBookTitle(librero);

        return librero;

    }

    public static Libro[][] modificarLibro(String bookTitle, String author, int year, Libro[][] librero) {

        boolean found = false;
        Libro[][] new_librero = librero;

        for (int i = 0; i < librero.length; i++) {
            for (int j = 0; j < librero[i].length; j++) {

                Libro selectedBook = librero[i][j];

                if (selectedBook.getBookTitle().equals(bookTitle) && selectedBook.getAuthorName().equals(author) && selectedBook.getYear() == year) {
                    found = true;

                    if (found) {
                        System.out.println("\nIngrese el titulo del libro: ");
                        String bookName = sc.next();

                        // sets author
                        System.out.println("\nIngrese el escritor: ");
                        String authorName = sc.next();

                        // sets year
                        System.out.println("\nIngrese el año de publicacion: ");
                        int yearPublished = sc.nextInt();

                        Libro book = new Libro(bookName, authorName, yearPublished);

                        new_librero[i][j] = book;

                    }
                    
                    break;

                }

            }

        }
        
        if(!found){
            System.out.println("El libro no se encuentra en el librero");
        }

        return new_librero;
    }

    public static void printBookTitle(Libro[][] librero) {
        for (int i = 0; i < librero.length; i++) {
            for (int j = 0; j < librero[i].length; j++) {
                Libro librito = librero[i][j];
                System.out.print("[" + librito.getBookTitle() + "]");

            }
            System.out.println();

        }

    }

}
