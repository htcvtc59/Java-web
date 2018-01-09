/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domdemo;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author MacOS
 */
public class ShowData {

    public static void main(String[] args) {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder builder = dbf.newDocumentBuilder();
            String path = "src\\app\\Data.xml";
            File f = new File(path);
            Document doc = builder.parse(f);
            NodeList products = doc.getElementsByTagName("Product");
            System.out.println("Product List");
            System.out.println("ProductID\tProductName\tPrice\t\tQuantity\tImage");

            for (int i = 0; i < products.getLength(); i++) {
                Node temp = products.item(i);
                NodeList child = temp.getChildNodes();
                for (int j = 0; j < child.getLength(); j++) {
                    if (!child.item(j).getNodeName().equals("#text")) {
                        System.out.print(child.item(j).getTextContent() + "\t\t");
                    }

                }
                System.out.println();
            }

        } catch (ParserConfigurationException ex) {
            Logger.getLogger(DOMDemo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SAXException ex) {
            Logger.getLogger(DOMDemo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DOMDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
