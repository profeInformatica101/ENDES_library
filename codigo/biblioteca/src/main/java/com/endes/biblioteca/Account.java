package com.endes.biblioteca;

import java.util.Date;

import com.endes.biblioteca.enumerado.AccountState;

public class Account {
	
	 public static final int BORROWED_TOTAL = 12;
	 public static final int RESERVED_TOTAL = 3;
	
	
	private String number_id;
	private History history;
	private Date opened;
	private AccountState state;
	
    private BookItem[] borrowed = new BookItem[BORROWED_TOTAL];
    private BookItem[] reserved = new BookItem[RESERVED_TOTAL];

	
}
