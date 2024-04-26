package com.endes.biblioteca;

import java.util.Date;
import java.util.UUID;

import com.endes.biblioteca.enumerado.Language;

public class BookItem extends Book{
	

	private String barcode;
	private RFID tag;
	private Boolean isRefereceOnly;
	
	
	public BookItem(String iSBN, String title, String summary, String publisher, Date publication,
			Integer numberOfPages, Language language) {
		super(iSBN, title, summary, publisher, publication, numberOfPages, language);
		
		this.barcode = UUID.randomUUID().toString();
		this.isRefereceOnly = true;
	}
	
	
	public String getBarcode() {
		return barcode;
	}
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	public RFID getTag() {
		return tag;
	}
	public void setTag(RFID tag) {
		this.tag = tag;
	}
	public Boolean getIsRefereceOnly() {
		return isRefereceOnly;
	}
	public void setIsRefereceOnly(Boolean isRefereceOnly) {
		this.isRefereceOnly = isRefereceOnly;
	}


	@Override
	public String toString() {
		return "BookItem [barcode=" + barcode + ", tag=" + tag + ", isRefereceOnly=" + isRefereceOnly + ", getISBN()="
				+ getISBN() + ", getTitle()=" + getTitle() + ", getSummary()=" + getSummary() + ", getPublisher()="
				+ getPublisher() + ", getPublication()=" + getPublication() + ", getNumberOfPages()="
				+ getNumberOfPages() + ", getLanguage()=" + getLanguage() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}


	

	
	
}
