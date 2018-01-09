/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam_xml;

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
import javax.xml.transform.Source;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.Comment;
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
public class EXAM_XML {

    public static void writefile(String namefile, String rootname, String rootchild, String sname, String saddress, String sphone,
            String attsex, String snamevalue, String saddressvalue, String sphonevalue,
            String attsexvalue) {
        String path = "src\\app\\" + namefile + ".xml";
        File f = new File(path);

        if (f.exists()) {

            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            try {
                DocumentBuilder builder = dbf.newDocumentBuilder();
                Document doc = builder.parse(f);

                Element root = doc.getDocumentElement();

                Element student = doc.createElement(rootchild);
                student.setAttribute(attsex, attsexvalue);

                Element studentname = doc.createElement(sname);
                Text namevalue = doc.createTextNode(snamevalue);
                studentname.appendChild(namevalue);

                Element studentaddress = doc.createElement(saddress);
                Text addressvalue = doc.createTextNode(saddressvalue);
                studentaddress.appendChild(addressvalue);

                Element studentphone = doc.createElement(sphone);
                Text phonevalue = doc.createTextNode(sphonevalue);
                studentphone.appendChild(phonevalue);

                student.appendChild(studentname);
                student.appendChild(studentaddress);
                student.appendChild(studentphone);

                root.appendChild(student);

                DOMSource source = new DOMSource(doc);

                Result result = new StreamResult(f);
                TransformerFactory transformerFactory = TransformerFactory.newInstance();
                Transformer transformer = transformerFactory.newTransformer();
                transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "no");
                transformer.setOutputProperty(OutputKeys.INDENT, "yes");
                transformer.transform(source, result);

                System.out.println("Write data " + path);

            } catch (ParserConfigurationException ex) {
                Logger.getLogger(EXAM_XML.class.getName()).log(Level.SEVERE, null, ex);
            } catch (TransformerConfigurationException ex) {
                Logger.getLogger(EXAM_XML.class.getName()).log(Level.SEVERE, null, ex);
            } catch (TransformerException ex) {
                Logger.getLogger(EXAM_XML.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SAXException ex) {
                Logger.getLogger(EXAM_XML.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(EXAM_XML.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {

            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            try {
                DocumentBuilder builder = dbf.newDocumentBuilder();
                Document doc = builder.newDocument();

                Element root = doc.createElement(rootname);
                Element student = doc.createElement(rootchild);
                student.setAttribute(attsex, attsexvalue);

                Element studentname = doc.createElement(sname);
                Text namevalue = doc.createTextNode(snamevalue);
                studentname.appendChild(namevalue);

                Element studentaddress = doc.createElement(saddress);
                Text addressvalue = doc.createTextNode(saddressvalue);
                studentaddress.appendChild(addressvalue);

                Element studentphone = doc.createElement(sphone);
                Text phonevalue = doc.createTextNode(sphonevalue);
                studentphone.appendChild(phonevalue);

                student.appendChild(studentname);
                student.appendChild(studentaddress);
                student.appendChild(studentphone);

                student.appendChild(studentname);
                student.appendChild(studentaddress);
                student.appendChild(studentphone);
                root.appendChild(student);
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
                Logger.getLogger(EXAM_XML.class.getName()).log(Level.SEVERE, null, ex);
            } catch (TransformerConfigurationException ex) {
                Logger.getLogger(EXAM_XML.class.getName()).log(Level.SEVERE, null, ex);
            } catch (TransformerException ex) {
                Logger.getLogger(EXAM_XML.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    //Remove
    public static void searchlastStudentAndDelete(String path, String childname) {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dbf.newDocumentBuilder();
            Document doc = builder.parse(new File(path));
            NodeList lst = doc.getElementsByTagName(childname);
            NodeList list = lst.item(0).getChildNodes();
            for (int i = 0; i < list.getLength(); i++) {
                Node n = list.item(i);
                lst.item(list.getLength()).removeChild(n);
                System.out.println(i);

            }
            saveData(doc, path);
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(EXAM_XML.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SAXException ex) {
            Logger.getLogger(EXAM_XML.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EXAM_XML.class.getName()).log(Level.SEVERE, null, ex);
        }

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
            Logger.getLogger(EXAM_XML.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TransformerException ex) {
            Logger.getLogger(EXAM_XML.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
     public static void createComment() {
        try {
            String filepath = "src\\app\\student.xml";
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            Document doc = docBuilder.parse(filepath);

            Element element = doc.getDocumentElement();
            Comment comment = doc.createComment("This is a comment");
            element.getParentNode().insertBefore(comment, element);

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult("src\\app\\student.xml");

            transformer.transform(source, result);
            
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(EXAM_XML.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SAXException ex) {
            Logger.getLogger(EXAM_XML.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EXAM_XML.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TransformerConfigurationException ex) {
            Logger.getLogger(EXAM_XML.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TransformerException ex) {
            Logger.getLogger(EXAM_XML.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
     public static void insertBefore() {
        try {
            String filepath = "src\\app\\student.xml";
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            Document doc = docBuilder.parse(filepath);

            Node students = doc.getElementsByTagName("students").item(0);
            NodeList list = students.getChildNodes();

            Element student = doc.createElement("student");
            Attr attr = doc.createAttribute("sex");
            attr.setValue("male");
            student.setAttributeNode(attr);

            Element firstname = doc.createElement("name");
            firstname.appendChild(doc.createTextNode("Dinh Van Tron"));
            student.appendChild(firstname);

            Element lastname = doc.createElement("address");
            lastname.appendChild(doc.createTextNode("Ha Nam"));
            student.appendChild(lastname);

            Element nickname = doc.createElement("phone");
            nickname.appendChild(doc.createTextNode("0312312314"));
            student.appendChild(nickname);

            list.item(1).getParentNode().insertBefore(student, list.item(1));

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult("src\\app\\student.xml");

            transformer.transform(source, result);
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(EXAM_XML.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SAXException ex) {
            Logger.getLogger(EXAM_XML.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EXAM_XML.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TransformerConfigurationException ex) {
            Logger.getLogger(EXAM_XML.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TransformerException ex) {
            Logger.getLogger(EXAM_XML.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

     
    private static void removeLastChild() {
        try {
            String filepath = "src\\app\\student.xml";
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            Document doc = docBuilder.parse(filepath);

            Element element = (Element) doc.getElementsByTagName("student").item(2);
            element.getParentNode().removeChild(element);

            doc.normalize();

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult("src\\app\\student.xml");

            transformer.transform(source, result);
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(EXAM_XML.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SAXException ex) {
            Logger.getLogger(EXAM_XML.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EXAM_XML.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TransformerConfigurationException ex) {
            Logger.getLogger(EXAM_XML.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TransformerException ex) {
            Logger.getLogger(EXAM_XML.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String[] args) {
//        writefile("student", "students", "student", "name", "address", "phone", "sex", "Phan Thuy Duong", "Hai Phong", "0999123334", "female");
//        writefile("student", "students", "student", "name", "address", "phone", "sex", "Nguyen Thanh Long", "Hong Kong", "9733453346", "male");

//        String path = "src\\app\\student.xml";
//        searchlastStudentAndDelete(path, "student");
        
//        createComment();
//        insertBefore();
//removeLastChild();

    }

}
