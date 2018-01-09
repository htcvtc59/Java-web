/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app;


import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Source;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.sax.SAXSource;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/**
 *
 * @author Administrator
 */
public class DemoDOMValidate {
public static void main(String...a) 
   {
        try {
            File f=new File("src\\app\\StudentInfor.xml");
            DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
            DocumentBuilder builder=dbf.newDocumentBuilder();
            Document doc=builder.parse(f);
            DOMSource dOMSource=new DOMSource(doc);           
            SchemaFactory schemaFactory=SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Source schemaFile=new StreamSource(new File("src\\app\\StudentSchema.xsd"));
            Schema schema=schemaFactory.newSchema(schemaFile);
            //create validator
            Validator validator=schema.newValidator();
            validator.validate(dOMSource);
            System.out.println("Document is valid");
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(DemoDOMValidate.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DemoSAXValidate.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SAXException ex) {
            Logger.getLogger(DemoSAXValidate.class.getName()).log(Level.SEVERE, null, ex);
        }
   }    
}
