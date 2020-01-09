package com.baseX;

import java.io.IOException;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import connectserver.Jbase;
import dataRepository.BooksRepository;
import dataRepository.StationRepository;
import model.Station;
import xmlUtilities.XmlReader;

@SpringBootApplication
public class BaseXApplication {

	public static void main(String[] args) throws Exception {
		
		SpringApplication.run(BaseXApplication.class, args);
		//BooksRepository bk = new BooksRepository(); 
		StationRepository st = new StationRepository();
		
		
		/*
			test of findAll to fetch the whole xml file with XQUERY language
		*/
		//String all = st.findAll(); 
	    //System.out.println(all); 
		/*
		 * test of findByVille to fetch nodes of a special city, to get pdv of city 
		 */
		//String cities = st.findByVille("JOUY LE MOUTIER");
		//System.out.println(cities); 
		
		/*
		 * test of findByService to fetch pdv giving a special kind of services DAB for example 
		 */
		String services = st.findByService("DAB"); 
		System.out.println(services); 
		
	
		
		
		
		
		
		
		
		
		
//		String xml = "<pdv id=\"93330003\" latitude=\"4885427\" longitude=\"252019\" cp=\"93330\" pop=\"R\">\n" + 
//				"  <adresse>9 Boulevard du Maréchal Foch</adresse>\n" + 
//				"  <ville>NEUILLY-SUR-MARNE</ville>\n" + 
//				"  <services>\n" + 
//				"    <service>Carburant additivé</service>\n" + 
//				"    <service>Boutique alimentaire</service>\n" + 
//				"    <service>Station de gonflage</service>\n" + 
//				"    <service>Boutique non alimentaire</service>\n" + 
//				"    <service>Services réparation / entretien</service>\n" + 
//				"    <service>Piste poids lourds</service>\n" + 
//				"    <service>DAB (Distributeur automatique de billets)</service>\n" + 
//				"    <service>Lavage automatique</service>\n" + 
//				"    <service>Lavage manuel</service>\n" + 
//				"    <service>Vente de fioul domestique</service>\n" + 
//				"  </services>\n" + 
//				"  <rupture id=\"2\" nom=\"SP95\" debut=\"2010-07-26T15:48:00\" fin=\"\"/>\n" + 
//				"  <rupture id=\"4\" nom=\"GPLc\" debut=\"2010-07-26T15:49:00\" fin=\"\"/>\n" + 
//				"</pdv>" ; 
//		
//		XmlReader rd = new XmlReader(); 
//		List<String> ids = rd.convertXmlToObject(xml); 
//		System.out.println(ids); 
		 
	}
	
}
