package com.endes.biblioteca.main;

import com.endes.biblioteca.enumerado.Language;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
       
        
        for( Language lang : Language.values()) {
        	System.out.println(lang);
        }
       
        
        Language actual = Language.ES;
        
        System.out.println("El lenguaje actual es : "+ actual);
    }
}
