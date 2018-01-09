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
import org.w3c.dom.Element;
import org.w3c.dom.Text;
import org.xml.sax.SAXException;

/**
 *
 * @author MacOS
 */
public class CreateDom {

    public static void main(String[] args) {
        new CreateDom().writefile("studentinfor", "StudentList", "Student", "StudentID", "StudentName", "Mark", "A001", "Demo", "20");
    }

    public void writefile(String namefile, String rootname, String rootchild, String sid, String sname, String smark,
            String sidv, String snamev, String smarkv) {
        String path = "src\\app\\" + namefile + ".xml";
        File f = new File(path);
        
        if (f.exists()) {
            
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            try {
                DocumentBuilder builder = dbf.newDocumentBuilder();
                Document doc = builder.parse(f);

                Element root = doc.getDocumentElement();

                Element student = doc.createElement(rootchild);
                
                Element studentid = doc.createElement(sid);
                Text idvalue = doc.createTextNode(sidv);
                studentid.appendChild(idvalue);

                Element studentname = doc.createElement(sname);
                Text namevalue = doc.createTextNode(snamev);
                studentname.appendChild(namevalue);

                Element studentmark = doc.createElement(smark);
                Text markvalue = doc.createTextNode(smarkv);
                studentmark.appendChild(markvalue);

                student.appendChild(studentid);
                student.appendChild(studentname);
                student.appendChild(studentmark);

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
                Logger.getLogger(CreateDom.class.getName()).log(Level.SEVERE, null, ex);
            } catch (TransformerConfigurationException ex) {
                Logger.getLogger(CreateDom.class.getName()).log(Level.SEVERE, null, ex);
            } catch (TransformerException ex) {
                Logger.getLogger(CreateDom.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SAXException ex) {
                Logger.getLogger(CreateDom.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(CreateDom.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {

            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            try {
                DocumentBuilder builder = dbf.newDocumentBuilder();
                Document doc = builder.newDocument();

                Element root = doc.createElement(rootname);
                Element student = doc.createElement(rootchild);
                
                Element studentid = doc.createElement(sid);
                Text idvalue = doc.createTextNode(sidv);
                studentid.appendChild(idvalue);

                Element studentname = doc.createElement(sname);
                Text namevalue = doc.createTextNode(snamev);
                studentname.appendChild(namevalue);

                Element studentmark = doc.createElement(smark);
                Text markvalue = doc.createTextNode(smarkv);
                studentmark.appendChild(markvalue);

                student.appendChild(studentid);
                student.appendChild(studentname);
                student.appendChild(studentmark);
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
                Logger.getLogger(CreateDom.class.getName()).log(Level.SEVERE, null, ex);
            } catch (TransformerConfigurationException ex) {
                Logger.getLogger(CreateDom.class.getName()).log(Level.SEVERE, null, ex);
            } catch (TransformerException ex) {
                Logger.getLogger(CreateDom.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

}
