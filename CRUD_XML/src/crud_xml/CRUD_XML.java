/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud_xml;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
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
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;
import org.xml.sax.SAXException;

/**
 *
 * @author MacOS
 */
public class CRUD_XML {

    private static String path = "src\\app\\Data.xml";

    public static ArrayList<Node> search(String name) {
        Document doc = parserData();
        ArrayList<Node> result = new ArrayList<>();
        NodeList temp = doc.getElementsByTagName("ProductName");
        for (int i = 0; i < temp.getLength(); i++) {
            String text = temp.item(i).getTextContent();
            if (text.startsWith(name) || text.endsWith(name)) {
                Node p = temp.item(i).getParentNode();
                result.add(p);
            }
        }
        return result;

    }

    public static Document parserData() {
        Document doc = null;
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dbf.newDocumentBuilder();
            File f = new File(path);
            doc = builder.parse(f);
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(CRUD_XML.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SAXException ex) {
            Logger.getLogger(CRUD_XML.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CRUD_XML.class.getName()).log(Level.SEVERE, null, ex);
        }
        return doc;

    }

    public void writefile(String namefile, String rootname, String rootchild, String pid, String pname, String pprice, String pquantity, String pimage,
            String idp, String namep, String pricep, String quantityp, String imagep) {
        String path = "src\\app\\" + namefile + ".xml";
        File f = new File(path);

        if (f.exists()) {

            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            try {
                DocumentBuilder builder = dbf.newDocumentBuilder();
                Document doc = builder.parse(f);

                Element root = doc.getDocumentElement();

                Element product = doc.createElement(rootchild);

                Element proid = doc.createElement(pid);
                Text idprovalue = doc.createTextNode(idp);
                proid.appendChild(idprovalue);

                Element proname = doc.createElement(pname);
                Text nameprovalue = doc.createTextNode(namep);
                proname.appendChild(nameprovalue);

                Element proprice = doc.createElement(pprice);
                Text propricevalue = doc.createTextNode(pricep);
                proprice.appendChild(propricevalue);

                Element proquantity = doc.createElement(pquantity);
                Text proquantityvalue = doc.createTextNode(quantityp);
                proquantity.appendChild(proquantityvalue);

                Element proimage = doc.createElement(pimage);
                Text proimagevalue = doc.createTextNode(imagep);
                proimage.appendChild(proimagevalue);

                product.appendChild(proid);
                product.appendChild(proname);
                product.appendChild(proprice);
                product.appendChild(proquantity);
                product.appendChild(proimage);

                root.appendChild(product);

                DOMSource source = new DOMSource(doc);

                Result result = new StreamResult(f);
                TransformerFactory transformerFactory = TransformerFactory.newInstance();
                Transformer transformer = transformerFactory.newTransformer();
                transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "no");
                transformer.setOutputProperty(OutputKeys.INDENT, "yes");
                transformer.transform(source, result);

                System.out.println("Write data " + path);

            } catch (ParserConfigurationException ex) {
                Logger.getLogger(CRUD_XML.class.getName()).log(Level.SEVERE, null, ex);
            } catch (TransformerConfigurationException ex) {
                Logger.getLogger(CRUD_XML.class.getName()).log(Level.SEVERE, null, ex);
            } catch (TransformerException ex) {
                Logger.getLogger(CRUD_XML.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SAXException ex) {
                Logger.getLogger(CRUD_XML.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(CRUD_XML.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {

            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            try {
                DocumentBuilder builder = dbf.newDocumentBuilder();
                Document doc = builder.newDocument();

                Element root = doc.createElement(rootname);
                Element product = doc.createElement(rootchild);

                Element proid = doc.createElement(pid);
                Text idprovalue = doc.createTextNode(idp);
                proid.appendChild(idprovalue);

                Element proname = doc.createElement(pname);
                Text nameprovalue = doc.createTextNode(namep);
                proname.appendChild(nameprovalue);

                Element proprice = doc.createElement(pprice);
                Text propricevalue = doc.createTextNode(pricep);
                proprice.appendChild(propricevalue);

                Element proquantity = doc.createElement(pquantity);
                Text proquantityvalue = doc.createTextNode(quantityp);
                proquantity.appendChild(proquantityvalue);

                Element proimage = doc.createElement(pimage);
                Text proimagevalue = doc.createTextNode(imagep);
                proimage.appendChild(proimagevalue);

                product.appendChild(proid);
                product.appendChild(proname);
                product.appendChild(proprice);
                product.appendChild(proquantity);
                product.appendChild(proimage);

                root.appendChild(product);
                doc.appendChild(root);

                DOMSource source = new DOMSource(doc);

                Result result = new StreamResult(f);
                TransformerFactory transformerFactory = TransformerFactory.newInstance();
                Transformer transformer = transformerFactory.newTransformer();
                transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "no");
                transformer.setOutputProperty(OutputKeys.INDENT, "yes");
                transformer.transform(source, result);

                System.out.println("Write data " + path);

            } catch (ParserConfigurationException ex) {
                Logger.getLogger(CRUD_XML.class.getName()).log(Level.SEVERE, null, ex);
            } catch (TransformerConfigurationException ex) {
                Logger.getLogger(CRUD_XML.class.getName()).log(Level.SEVERE, null, ex);
            } catch (TransformerException ex) {
                Logger.getLogger(CRUD_XML.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static void update(String id, String name, String price, String quantity,
            String image) {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dbf.newDocumentBuilder();
            Document doc = builder.parse(new File(path));
            Node node = searchByID(id, doc);
            NodeList list = node.getChildNodes();

            for (int i = 0; i < list.getLength(); i++) {
                Node nodeitem = list.item(i);
                if ("ProductName".equals(nodeitem.getNodeName())) {
                    nodeitem.setTextContent(name);
                }
                if ("Price".equals(nodeitem.getNodeName())) {
                    nodeitem.setTextContent(price);
                }
                if ("Quantity".equals(nodeitem.getNodeName())) {
                    nodeitem.setTextContent(quantity);
                }
                if ("Image".equals(nodeitem.getNodeName())) {
                    nodeitem.setTextContent(image);
                }
                
            }

            saveData(doc, path);

        } catch (ParserConfigurationException ex) {
            Logger.getLogger(CRUD_XML.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SAXException ex) {
            Logger.getLogger(CRUD_XML.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CRUD_XML.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void delete(String id) {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dbf.newDocumentBuilder();
            Document doc = builder.parse(new File(path));
            Node node = searchByID(id, doc);
            doc.getDocumentElement().removeChild(node);
            saveData(doc, path);

        } catch (ParserConfigurationException ex) {
            Logger.getLogger(CRUD_XML.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SAXException ex) {
            Logger.getLogger(CRUD_XML.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CRUD_XML.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static Node searchByID(String id, Document doc) {
        NodeList lst = doc.getElementsByTagName("ProductID");
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
            Logger.getLogger(CRUD_XML.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TransformerException ex) {
            Logger.getLogger(CRUD_XML.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
