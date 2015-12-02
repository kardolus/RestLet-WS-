package restful.restlet.pojo;

import org.restlet.data.MediaType;
import org.restlet.representation.Representation;
import org.restlet.representation.StringRepresentation;
import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

/**
 * @author Guillermo Kardolus
 */
public class PlainGetAllResource extends ServerResource { // need to extend ServerResource in order to attach
    @Get
    public Representation toPlain(){
        return new StringRepresentation(new Scientists().toString(), MediaType.TEXT_PLAIN);
    }
}
