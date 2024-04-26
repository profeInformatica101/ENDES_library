package com.endes.biblioteca;

public class BookItem extends Book{
	
	private String barcode;
	private RFID tag;
	private Boolean isRefereceOnly;
	
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

}
