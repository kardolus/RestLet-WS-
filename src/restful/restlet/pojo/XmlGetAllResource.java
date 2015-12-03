package restful.restlet.pojo;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.restlet.data.MediaType;
import org.restlet.ext.xml.DomRepresentation;
import org.restlet.representation.Representation;
import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 * @author Guillermo Kardolus
 */
public class XmlGetAllResource extends ServerResource { // need to extend ServerResource in order to attach
    
    @Get
    public Representation toXml(){
        DomRepresentation dom = null;
        try {
            dom = new DomRepresentation(MediaType.TEXT_XML);
            dom.setIndenting(true);
            Document doc = dom.getDocument();
            Element root = doc.createElement("scientists"); // root element
            
            for(Scientist s : Scientists.getScientistList()){
                Element next = doc.createElement("scientist");
                next.appendChild(doc.createTextNode(s.toString()));
                root.appendChild(next);
            }
            doc.appendChild(root);
        } catch (IOException ex) {
            Logger.getLogger(XmlGetAllResource.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dom;
    }
}
