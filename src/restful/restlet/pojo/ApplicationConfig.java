package restful.restlet.pojo;

import org.restlet.Application;
import org.restlet.Restlet;
import org.restlet.routing.Router;

/**
 * @author Guillermo Kardolus
 * This class includes the Restlet routing table
 */
public class ApplicationConfig extends Application{

    @Override
    public synchronized Restlet createInboundRoot() {
        // Create the Routing Table
        Router router = new Router(getContext());
        router.attach("/plain", PlainGetAllResource.class);
        //router.attach("/xml", XmlGetResource.class);
        //router.attach("/json", JsonGetResource.class);
        return router;
    }
}
