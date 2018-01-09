package asm_xml;

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

public class ASM_XML {

    public static void writefile(String namefile, String rootname, String rootchild, String namett, String statustt, String datett,
            String locationtt, String imagett, String namettvalue, String statusttvalue,
            String datettvalue, String locationttvalue, String imagettvalue) {
        String path = "src\\app\\" + namefile + ".xml";
        File f = new File(path);

        if (f.exists()) {

            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            try {
                DocumentBuilder builder = dbf.newDocumentBuilder();
                Document doc = builder.parse(f);

                Element root = doc.getDocumentElement();

                Element tt = doc.createElement(rootchild);

                Element ttname = doc.createElement(namett);
                Text namevalue = doc.createTextNode(namettvalue);
                ttname.appendChild(namevalue);

                Element ttstatus = doc.createElement(statustt);
                Text statusvalue = doc.createTextNode(statusttvalue);
                ttstatus.appendChild(statusvalue);

                Element ttdate = doc.createElement(datett);
                Text datevalue = doc.createTextNode(datettvalue);
                ttdate.appendChild(datevalue);

                Element ttlocation = doc.createElement(locationtt);
                Text locationvalue = doc.createTextNode(locationttvalue);
                ttlocation.appendChild(locationvalue);

                Element ttimage = doc.createElement(imagett);
                Text imagevalue = doc.createTextNode(imagettvalue);
                ttimage.appendChild(imagevalue);

                tt.appendChild(ttname);
                tt.appendChild(ttstatus);
                tt.appendChild(ttdate);
                tt.appendChild(ttlocation);
                tt.appendChild(ttimage);

                root.appendChild(tt);

                DOMSource source = new DOMSource(doc);

                Result result = new StreamResult(f);
                TransformerFactory transformerFactory = TransformerFactory.newInstance();
                Transformer transformer = transformerFactory.newTransformer();
                transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "no");
                transformer.setOutputProperty(OutputKeys.INDENT, "yes");
                transformer.transform(source, result);

                System.out.println("Write data " + path);

            } catch (ParserConfigurationException ex) {
                Logger.getLogger(ASM_XML.class.getName()).log(Level.SEVERE, null, ex);
            } catch (TransformerConfigurationException ex) {
                Logger.getLogger(ASM_XML.class.getName()).log(Level.SEVERE, null, ex);
            } catch (TransformerException ex) {
                Logger.getLogger(ASM_XML.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SAXException ex) {
                Logger.getLogger(ASM_XML.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(ASM_XML.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {

            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            try {
                DocumentBuilder builder = dbf.newDocumentBuilder();
                Document doc = builder.newDocument();

                Element root = doc.createElement(rootname);
                
                Element tt = doc.createElement(rootchild);

                Element ttname = doc.createElement(namett);
                Text namevalue = doc.createTextNode(namettvalue);
                ttname.appendChild(namevalue);

                Element ttstatus = doc.createElement(statustt);
                Text statusvalue = doc.createTextNode(statusttvalue);
                ttstatus.appendChild(statusvalue);

                Element ttdate = doc.createElement(datett);
                Text datevalue = doc.createTextNode(datettvalue);
                ttdate.appendChild(datevalue);

                Element ttlocation = doc.createElement(locationtt);
                Text locationvalue = doc.createTextNode(locationttvalue);
                ttlocation.appendChild(locationvalue);

                Element ttimage = doc.createElement(imagett);
                Text imagevalue = doc.createTextNode(imagettvalue);
                ttimage.appendChild(imagevalue);

                tt.appendChild(ttname);
                tt.appendChild(ttstatus);
                tt.appendChild(ttdate);
                tt.appendChild(ttlocation);
                tt.appendChild(ttimage);
                
                root.appendChild(tt);
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
                Logger.getLogger(ASM_XML.class.getName()).log(Level.SEVERE, null, ex);
            } catch (TransformerConfigurationException ex) {
                Logger.getLogger(ASM_XML.class.getName()).log(Level.SEVERE, null, ex);
            } catch (TransformerException ex) {
                Logger.getLogger(ASM_XML.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }
    
    
    private static String path = "src\\app\\tt.xml";

    public static ArrayList<Node> searchlocation(String name) {
        Document doc = parserData();
        ArrayList<Node> result = new ArrayList<>();
        NodeList temp = doc.getElementsByTagName("location");
        for (int i = 0; i < temp.getLength(); i++) {
            String text = temp.item(i).getTextContent();
            if (text.startsWith(name) || text.endsWith(name)) {
                Node p = temp.item(i).getParentNode();
                result.add(p);
            }
        }
        return result;

    }
    
     public static ArrayList<Node> searchdate(String date) {
        Document doc = parserData();
        ArrayList<Node> result = new ArrayList<>();
        NodeList temp = doc.getElementsByTagName("date");
        for (int i = 0; i < temp.getLength(); i++) {
            String text = temp.item(i).getTextContent();
            if (text.startsWith(date) || text.endsWith(date)) {
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
            Logger.getLogger(ASM_XML.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SAXException ex) {
            Logger.getLogger(ASM_XML.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ASM_XML.class.getName()).log(Level.SEVERE, null, ex);
        }
        return doc;

    }
    
    public static Node searchByDate(String id, Document doc) {
        NodeList lst = doc.getElementsByTagName("date");
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
            Logger.getLogger(ASM_XML.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TransformerException ex) {
            Logger.getLogger(ASM_XML.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void main(String[] args) {
         writefile("tt","TrangThaiThoiTiet","ThoiTiet","name","status","date","location","image","111","mua","28/11/2017","HaNoi","C/dsdsd");
    }

}
