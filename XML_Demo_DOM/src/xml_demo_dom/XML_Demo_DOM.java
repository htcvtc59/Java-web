/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xml_demo_dom;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XML_Demo_DOM {

    public static void main(String[] args) {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder builder = dbf.newDocumentBuilder();
            String path = "src\\app\\Data.xml";
            File f = new File(path);
            Document doc = builder.parse(f);
            System.out.println("Root Name " + doc.getDocumentElement().getNodeName());
            NodeList products = doc.getElementsByTagName("Product");
            System.out.println("Number of product " + products.getLength());

            
            
            
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(XML_Demo_DOM.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SAXException ex) {
            Logger.getLogger(XML_Demo_DOM.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(XML_Demo_DOM.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
