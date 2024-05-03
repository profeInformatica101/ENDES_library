package com.endes.biblioteca;

import java.util.HashMap;
import java.util.Set;

public class Library {
	
	private String name;
	private String address;
	private Set<Catalog> catalogs;
	private HashMap<String, BookItem> books = new HashMap();
	private HashMap<String, Account> accounts = new HashMap();
	

}
