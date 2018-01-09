/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.XMLConstants;
import javax.xml.transform.Source;
import javax.xml.transform.sax.SAXSource;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/**
 *
 * @author Administrator
 */
public class DemoSAXValidate {
   public static void main(String...a) 
   {
        try {
            File f=new File("src\\app\\StudentInfor.xml");
            InputSource is=new InputSource(new FileReader(f));
            SAXSource sAXSource=new SAXSource(is);
            //create scheam instance
            SchemaFactory schemaFactory=SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Source schemaFile=new StreamSource(new File("src\\app\\StudentSchema.xsd"));
            Schema schema=schemaFactory.newSchema(schemaFile);
            //create validator
            Validator validator=schema.newValidator();
            validator.validate(sAXSource);
            System.out.println("Document is valid");
        } catch (IOException ex) {
            Logger.getLogger(DemoSAXValidate.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SAXException ex) {
            Logger.getLogger(DemoSAXValidate.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
}
