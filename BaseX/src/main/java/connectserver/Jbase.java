package connectserver;



import java.io.IOException;
import java.io.OutputStream;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public final class Jbase {
	
	private BaseXClient baseXClient; 
	private static final int port = 1984; 
	private static final String host = "localhost"; 
	private static final String name = "admin"; 
	private static final String password = "admin"; 
	private static final String dbname = "dbProject"; 
	
	
	public Jbase() {	
		try {
			baseXClient = new BaseXClient(host ,port , name , password);
			System.out.println("Connection to the database server with succes ...");
			System.out.println("waiting for your requests ...");
			open(dbname);
			System.out.println("Database opened and ready for requests ...");
		} catch (IOException e) {
			e.printStackTrace();
		} 	
	}

	public  BaseXClient getBaseXClient() {
		return baseXClient;
	}
	
	private String open(String dbname) throws IOException {
		 
		  return baseXClient.execute("CHECK dbProject"); 
	}
	
}
