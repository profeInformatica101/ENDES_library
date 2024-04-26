package com.endes.biblioteca.main;

import java.util.Date;
import java.util.UUID;

import com.endes.biblioteca.BookItem;
import com.endes.biblioteca.enumerado.Language;
import com.github.javafaker.Faker;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args )
    {
       Faker faker = new Faker();
    	
    	
        //(String iSBN, String title, String summary, String publisher, Date publication, Integer numberOfPages, Language language)
        BookItem libro1 = new BookItem(faker.code().isbn10(), faker.book().title(), faker.lorem().sentence(), faker.book().publisher(), faker.date().birthday(10, 100), faker.number().numberBetween(10, 1500), Language.ES);
        System.out.println(libro1);

    }
    
    
    /**
     * Prueba de uso de Enumerado
     */
    public static void pruebaEnumerado() {
    	
    	for( Language lang : Language.values()) {
        	System.out.println(lang);
        }
       
        
        Language actual = Language.ES;
        
        System.out.println("El lenguaje actual es : "+ actual);
    }
}
