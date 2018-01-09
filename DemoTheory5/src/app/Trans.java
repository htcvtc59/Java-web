/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app;


import java.io.FileOutputStream;
import javax.xml.transform.*;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

/**
 *
 * @author Administrator
 */
public class Trans {
    public static void main(String...a)
    {
    try{
            TransformerFactory tFactory = TransformerFactory.newInstance();    
            // Create a Transformer for the specified stylesheet
            Transformer transformer = tFactory.newTransformer(new StreamSource("src\\app\\football.xsl"));
            FileOutputStream fos = new FileOutputStream("src\\app\\football.html");
            // Create a StreamResult instance
            StreamResult sr = new StreamResult(fos);
            // Create a StreamSource instance
            StreamSource ss = new StreamSource("src\\app\\football.xml");
            //Transform the XML source and send the output to a result object
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.transform(ss, sr);
            // To print the output in user console
            System.out.println("File football.html created in current folder");
}catch(Exception e) 
{
    System.out.println(e.getMessage());
}
       
}

}
