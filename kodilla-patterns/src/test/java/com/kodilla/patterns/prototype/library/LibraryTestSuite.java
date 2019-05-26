package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //Given
        Library library = new Library("Biblioteka");
        IntStream.iterate(1, n -> n + 1)
                .limit(9)
                .forEach(n -> library.books.add(new Book("Książka " + n, "Autor " + n, LocalDate.of(1997, 11, 1))));
        //When

        Library cloneLibrary = null;
        try {
            cloneLibrary = library.shallowCopy();
            cloneLibrary.setLibraryName("Shallow clone of Biblioteka");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepCloneLibrary = null;
        try {
            deepCloneLibrary = library.deepCopy();
            deepCloneLibrary.setLibraryName("Deep clone of Biblioteka");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        deepCloneLibrary.setLibraryName("Deep clone of Biblioteka");
        deepCloneLibrary.books.add(new Book("Książkadd", "Autoradd", LocalDate.of(1997,3,5)));

        //Then
        System.out.println(library.getName());
        library.books.stream().forEach(n -> System.out.println(n.getTitle() + " " + n.getAuthor() + " " + n.getPublicationDate()));

        System.out.println(cloneLibrary.getName());
        cloneLibrary.books.stream().forEach(n -> System.out.println(n.getTitle() + " " + n.getAuthor() + " " + n.getPublicationDate()));

        System.out.println(deepCloneLibrary.getName());
        deepCloneLibrary.books.stream().forEach(n -> System.out.println(n.getTitle() + " " + n.getAuthor() + " " + n.getPublicationDate()));

        Assert.assertEquals(9, library.books.size());
        Assert.assertEquals(9, cloneLibrary.books.size());
        Assert.assertEquals(10, deepCloneLibrary.books.size());
    }
}
