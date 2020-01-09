package dataRepository;

 

import java.io.IOException;

import connectserver.Jbase;
import model.Book;

public class BooksRepository {
	
	private Jbase jbase; 
	
	public BooksRepository() {
		jbase = new Jbase(); 
	}
	
	
	
	public String  findAll() throws IOException{
		String results = jbase.getBaseXClient().execute("XQUERY //catalog"); 
		return results;	
	}
	public String findByTitle(String title) throws IOException {
		String results = jbase.getBaseXClient().execute("XQUERY for $x in doc(\"bookStoreBD.xml\")/catalog/book "
														+ "where $x/title= '"+title+"' return $x");	
		return results; 
	}
	public String findByAuthor(String author) throws IOException {
		String results = jbase.getBaseXClient().execute("XQUERY for $x in doc(\"bookStoreBD.xml\")/catalog/book "
				+ "where $x/title= '"+author+"' return $x");	
		return results; 
	}
	public String findByGenre(String genre) throws IOException {
		
		String results = jbase.getBaseXClient().execute("XQUERY for $x in doc(\"bookStoreBD.xml\")/catalog/book "
				+ "where $x/genre= '"+genre+"' return $x");	
		return results; 
	}
	
	
	
}
