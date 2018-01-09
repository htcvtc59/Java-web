/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author Administrator
 */
public class DemoXPath {
    public static void main(String[] args) {
        try {
            // Obtain factory instance
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            // Obtain builder instance
            DocumentBuilder builder = factory.newDocumentBuilder();
            // Parse the specified document
            Document doc = builder.parse(new File("src\\app\\Data.xml"));
            // Obtain path factory instance
            XPathFactory xpathFactory = XPathFactory.newInstance();
            // Create a new empty path
            XPath xpath = xpathFactory.newXPath();
            // Evaluate the path//StudentList/Student
            NodeList list = (NodeList) xpath.evaluate("//Name",doc, XPathConstants.NODESET);
            for (int i = 0; i < list.getLength(); i++) {
                Node st = list.item(i);
                NodeList childStudents = st.getChildNodes();
                for (int j = 0; j < childStudents.getLength(); j++) {
                    System.out.print(childStudents.item(j).getNodeName() + ":");
                    System.out.println(childStudents.item(j).getTextContent());
                }
            }
            // Print result on user console
            System.out.println("Number of Student is " + list.getLength() );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
