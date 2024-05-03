package com.endes.biblioteca;

import java.util.HashSet;
import java.util.Set;

import com.endes.biblioteca.servicio.Manage;
import com.endes.biblioteca.servicio.Search;

public class Catalog implements Search, Manage {
    private Set<BookItem> records;
    private String name;

    
    
   
    public Set<BookItem> getRecords() {
		return records;
	}


	public void setRecords(Set<BookItem> records) {
		this.records = records;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Catalog() {
        this.records = new HashSet<>();
    }

    
    @Override
    public BookItem searchByTitle(String title) {
        return records.stream()
                        .filter(bookItem -> bookItem.getTitle().equals(title))
                        .findFirst()
                        .orElse(null);
    }
    
    @Override
    public BookItem searchByAuthor(String authorName) {
        return records.stream()
                        .filter(bookItem -> bookItem.getAuthors().stream()  // Accede a la corriente de autores
                            .anyMatch(author -> author.getName().equals(authorName)))  // Verifica si algún autor coincide con el nombre dado
                        .findFirst()
                        .orElse(null);
    }

    @Override
    public void createBookItem(BookItem bookItem) {
        records.add(bookItem);
    }

    @Override
    public void updateBookItem(BookItem bookItem) {
        if(records.contains(bookItem)) {
            records.remove(bookItem);
            records.add(bookItem);
        }
    }

    @Override
    public void deleteBookItem(String ISBN) {
        records.removeIf(bookItem -> bookItem.getISBN().equals(ISBN));
    }

    @Override
    public BookItem getBookItem(String ISBN) {
        return records.stream()
                        .filter(bookItem -> bookItem.getISBN().equals(ISBN))
                        .findFirst()
                        .orElse(null);
    }
}