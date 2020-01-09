package model;

import lombok.Data;

@Data
public class Book {
	
	private String id; 
	private String author; 
	private String title;
	private String genre;
	private double price;
	private Data publish_date; 
	private String description;
	
	
	
	

}
