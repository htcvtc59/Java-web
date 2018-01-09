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
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Result;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author MacOS
 */
public class DOMDelete {

    public static void main(String[] args) {
        try {
            String path = "src\\app\\studentinfor.xml";
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dbf.newDocumentBuilder();
            Document doc = builder.parse(new File(path));
            
            String id = "A001";
            Node node = searchByID(id, doc);
            doc.getDocumentElement().removeChild(node);
            saveData(doc, path);
            
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(DOMDelete.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SAXException ex) {
            Logger.getLogger(DOMDelete.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DOMDelete.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static Node searchByID(String id, Document doc) {
        NodeList lst = doc.getElementsByTagName("StudentID");
        for (int i = 0; i < lst.getLength(); i++) {
            String content = lst.item(i).getTextContent();
            if (content.equalsIgnoreCase(id)) {
                Node p = lst.item(i).getParentNode();
                return p;
            }
        }
        return null;
    }

    public static void saveData(Document doc, String path) {
        File f = new File(path);
        DOMSource source = new DOMSource(doc);
        Result result = new StreamResult(f);
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        try {
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "no");
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.transform(source, result);

            System.out.println("Write data " + path);

        } catch (TransformerConfigurationException ex) {
            Logger.getLogger(DOMDelete.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TransformerException ex) {
            Logger.getLogger(DOMDelete.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
