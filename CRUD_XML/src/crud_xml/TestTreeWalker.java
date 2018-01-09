/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud_xml;

import com.sun.org.apache.xpath.internal.axes.WalkerFactory;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.traversal.DocumentTraversal;
import org.w3c.dom.traversal.NodeFilter;
import org.w3c.dom.traversal.TreeWalker;
import org.xml.sax.SAXException;

/**
 *
 * @author MacOS
 */
public class TestTreeWalker {

    public static void main(String[] args) {
        File f = new File("src\\app\\data.xml");
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder builder = dbf.newDocumentBuilder();
            Document doc = builder.parse(f);
            DocumentTraversal traversal = (DocumentTraversal) doc;
            TreeWalker treeWalker = traversal.createTreeWalker(doc.getDocumentElement(), NodeFilter.SHOW_ELEMENT,
                    null, true);
            traverseNodes(treeWalker,"");

        } catch (ParserConfigurationException ex) {
            Logger.getLogger(TestTreeWalker.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SAXException ex) {
            Logger.getLogger(TestTreeWalker.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TestTreeWalker.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private static void traverseNodes(TreeWalker walker, String indent) {
        Node node = walker.getCurrentNode();
        System.out.println(indent + "- " + ((Element) node).getTagName());

        for (Node n = walker.firstChild(); n != null; n = walker.nextSibling()) {
            traverseNodes(walker, indent + "\t");
        }
        walker.setCurrentNode(node);
    }

}
