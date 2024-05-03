package com.endes.biblioteca.servicio;

import com.endes.biblioteca.BookItem;

public interface Manage {
	  void createBookItem(BookItem bookItem);
	  void updateBookItem(BookItem bookItem);
	  void deleteBookItem(String ISBN);
	  BookItem getBookItem(String ISBN);
}
