package model;

import java.util.List;
import java.util.Map;

import lombok.Data;



@Data
public class Station {
	
	private String adresse;
	private String ville;
	private List<String> services;
	private Map<String,Double> gasPrices;
	private Map<String,Double> rupturesEngas;
	private double latitue;
	private double longitude;
	private Map<String , List<String>> horaires;	
}
