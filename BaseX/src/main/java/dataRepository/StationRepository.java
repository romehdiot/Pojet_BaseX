package dataRepository;

import java.io.IOException;

import connectserver.Jbase;

public class StationRepository {
	
private Jbase jbase; 
	
	public StationRepository() {
		jbase = new Jbase(); 
	}
	
	public String findAll() throws IOException {
		
		String resutls =jbase.getBaseXClient().execute("XQUERY //pdv_liste"); 
		return resutls;
	}
	public String findByVille(String ville) throws IOException {
		String results = jbase.getBaseXClient().execute("XQUERY for $x in doc(\"PrixCarburants_quotidien_20191209.xml\")/pdv_liste/pdv "
				+ "where $x/ville='"+ville+"' return $x"); 
		return results;	
	}
	public String findByService(String service) throws IOException {
		
		String results = jbase.getBaseXClient().execute("XQUERY for $x in doc(\"PrixCarburants_quotidien_20191209.xml\")/pdv_liste/pdv where $x/services/service[contains(.,'"+service+"')]\r\n" + 
				"return $x");
		return results;
	}
	public void save(Station station) throws IOException {
		//String resluts = jbase.getBaseXClient().execute("XQUERY let $q := < )
	}
	
}
