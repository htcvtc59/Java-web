package xml_demo_sax;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.SAXException;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

public class XML_Demo_SAX extends DefaultHandler {

    boolean ageFound;
    boolean nameFound;
    int agemax = 0;
    String student;

    int count;

    public XML_Demo_SAX() {
        count = 0;
    }

    @Override
    public void startDocument() throws SAXException {
        System.out.println("Start Document!");
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if (qName.equals("Student")) {
            count++;
            String StudentID = attributes.getValue("StudentID");
            System.out.println("StudentID :" + StudentID);
        }
        if (qName.equals("Name")) {
            nameFound = true;
        }
        if (qName.equals("Age")) {
            ageFound = true;
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        String str = new String(ch, start, length);
        str = str.trim();
        if (nameFound) {
            System.out.println("\tName " + str);
            nameFound = false;
        }

        if (ageFound) {
            System.out.println("\tAge " + str);
            if (agemax < Integer.parseInt(str)) {
                agemax = Integer.parseInt(str);
            }
            ageFound = false;
        }
        if (!str.equals("")) {
            student = student + "Age ";
        }
    }

    @Override
    public void endDocument() throws SAXException {
        System.out.println("Co " + count + " trong danh sach");
        System.out.println("\tAge " + agemax);
    }

    @Override
    public void endElement(String string, String localName, String qName) throws SAXException {
        if (qName.equals("Student")) {
            System.out.println(student);
        }

    }

    public static void main(String[] args) {
        XML_Demo_SAX saxObj = new XML_Demo_SAX();
        String path = "src\\app\\Student.xml";
        SAXParserFactory saxpf = SAXParserFactory.newInstance();
        try {
            SAXParser parser = saxpf.newSAXParser();
            File f = new File(path);
            parser.parse(f, saxObj);

        } catch (ParserConfigurationException ex) {
            Logger.getLogger(XML_Demo_SAX.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SAXException ex) {
            Logger.getLogger(XML_Demo_SAX.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(XML_Demo_SAX.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
