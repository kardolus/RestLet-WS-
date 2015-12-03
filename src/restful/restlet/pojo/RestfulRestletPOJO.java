package restful.restlet.pojo;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.restlet.Component;
import org.restlet.data.Protocol;

/**
 * @author misterclipping
 * This POJO publishes a Restlet Web Service
 */
public class RestfulRestletPOJO {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a new component
        Component component = new Component();
        
        // add a HTTP server listening on port 8182
        component.getServers().add(Protocol.HTTP, 8182);
        
        // Attach the application
        component.getDefaultHost().attach("/scientists", new ApplicationConfig());
        
        try {
            component.start();
        } catch (Exception ex) {
            Logger.getLogger(RestfulRestletPOJO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
