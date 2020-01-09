package xmlUtilities;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import model.Station;

public class XmlReader {

	
	
	public List<String> convertXmlToObject(String xml) throws Exception {
		
		List<Station> stations = new ArrayList<Station>(); 
		List<String> ids = new ArrayList<String>(); 
		Document dc = loadXMLFromString(xml); 
		NodeList nodes = dc.getElementsByTagName("pdv");
		
		for(int index=0 ; index<nodes.getLength(); index++) {
			
			Node node = nodes.item(index); 
			Element ele = (Element)node;
			String station_id = ele.getAttribute("id");
			Node adresse_node = ele.getElementsByTagName("adresse").item(0);
			String adresse = adresse_node.getTextContent(); 
			Node ville_node = ele.getElementsByTagName("ville").item(0); 
			String ville = ville_node.getTextContent(); 
			//NodeList services = ele.getElementsByTagName("services").item(0
			//for(int service = 0 ; service <services.getL)
			
			
			
			
			ids.add(station_id); 
			ids.add(adresse); 
			ids.add(ville); 
			
			
		
		}
		
		return ids ;
	}
	private Document loadXMLFromString(String xml) throws Exception
	{
	    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
	    factory.setNamespaceAware(true);
	    DocumentBuilder builder = factory.newDocumentBuilder();
	    return builder.parse(new ByteArrayInputStream(xml.getBytes()));
	}
}
