/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws_test_demo;

import app.GetListPro;
import javax.xml.parsers.*;
import org.xml.sax.InputSource;
import org.w3c.dom.*;
import java.io.*;

public class Ws_test_demo {

    public static void main(String[] args) {
        try {
            String listPro = getListPro();
            DocumentBuilderFactory dbf
                    = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            InputSource is = new InputSource();
            is.setCharacterStream(new StringReader(listPro));

            Document doc = db.parse(is);
            NodeList nodes = doc.getElementsByTagName("product");
            System.out.println(listPro);

            // iterate the employees
           for (int i = 0; i < nodes.getLength(); i++) {
           Element element = (Element) nodes.item(i);

           NodeList id = element.getElementsByTagName("id");
           Element line = (Element) id.item(0);
           System.out.println("id: " + getCharacterDataFromElement(line));
           
           NodeList name = element.getElementsByTagName("name");
           Element linename = (Element) name.item(0);
           System.out.println("Name: " + getCharacterDataFromElement(linename));

           NodeList price = element.getElementsByTagName("price");
           line = (Element) price.item(0);
           System.out.println("price: " + getCharacterDataFromElement(line));
        }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static String getCharacterDataFromElement(Element e) {
        Node child = e.getFirstChild();
        if (child instanceof CharacterData) {
            CharacterData cd = (CharacterData) child;
            return cd.getData();
        }
        return "?";
    }

    private static String getListPro() {
        app.NewWebService_Service service = new app.NewWebService_Service();
        app.NewWebService port = service.getNewWebServicePort();
        return port.getListPro();
    }

}
