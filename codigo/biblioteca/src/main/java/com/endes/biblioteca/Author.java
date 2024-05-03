package com.endes.biblioteca;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * 
 */
public class Author {
    private String name;
    private String biography;
    private Set<Book> books;

    public Author(String name, String biography) {
        this.name = name;
        this.biography = biography;
        this.books = new LinkedHashSet<>();
    }

    public void addBook(Book book) {
        if (books.add(book)) {  // add() returns true if this set did not already contain the specified element
            book.addAuthor(this);
        }
    }

    public Set<Book> getBooks() {
        return books;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBiography() {
		return biography;
	}

	public void setBiography(String biography) {
		this.biography = biography;
	}

	public void setBooks(Set<Book> books) {
		this.books = books;
	}

   
}
