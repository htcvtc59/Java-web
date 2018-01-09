package xml_demo_dom;

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

public class XML_ShowData {

    public static void main(String[] args) {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dbf.newDocumentBuilder();
            String path = "src\\app\\Data.xml";
            File f = new File(path);
            Document doc = builder.parse(f);
            NodeList products = doc.getElementsByTagName("Product");
            System.out.println("Product List ");
            System.out.println("ProductID\tProductName\tPrice\tQuantity");
            for (int i = 0; i < products.getLength(); i++) {
                Node temp = products.item(i);
                NodeList childs = temp.getChildNodes();
                for (int j = 0; j < childs.getLength(); j++) {
                    if (!childs.item(j).getNodeName().equals("#text")) {
                        System.out.print(childs.item(j).getTextContent() + "\t");
                    }
                   
                }
                 System.out.println();
            }

        } catch (ParserConfigurationException ex) {
            Logger.getLogger(XML_ShowData.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SAXException ex) {
            Logger.getLogger(XML_ShowData.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(XML_ShowData.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
