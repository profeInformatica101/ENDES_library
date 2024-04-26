package com.endes.biblioteca;

import java.util.Date;

import com.endes.biblioteca.enumerado.Language;


/**
 * @author Pablo
 * @version 1.0
 * 
 * Esta clase representa un libro abstracto
 * 
 */
public abstract class Book {

	private String ISBN;
	private String title;
	private String summary;
	private String publisher;
	private Date publication;
	private Integer numberOfPages;
	private Language language;
	
	/**
	 * Método que obtiene el ISBN del libro
	 * @return devuelve el ISBN del Libro
	 */
	public String getISBN() {
		return ISBN;
	}
	/**
	 * 
	 * @param iSBN El identificador para el sistema internacional de numeración del libro  
	 */
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public Date getPublication() {
		return publication;
	}
	public void setPublication(Date publication) {
		this.publication = publication;
	}
	public Integer getNumberOfPages() {
		return numberOfPages;
	}
	public void setNumberOfPages(Integer numberOfPages) {
		this.numberOfPages = numberOfPages;
	}
	public Language getLanguage() {
		return language;
	}
	public void setLanguage(Language language) {
		this.language = language;
	}
	
	
	
}
