package info.aaronland.extruder;

import info.aaronland.extruder.TextUtils;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.Produces;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.MediaType;

import de.jetwick.snacktory.HtmlFetcher;
import de.jetwick.snacktory.JResult;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Path(value = "/snacktory")
@Produces("text/html; charset=UTF-8")
public class SnacktoryResource {

    private static final Logger LOGGER = LoggerFactory.getLogger(SnacktoryResource.class);

    @GET
    public Response extrudeThis(@QueryParam("link") String link){

	JResult res = null;

	try {

	    HtmlFetcher fetcher = new HtmlFetcher();
	    Integer timeout_ms = 5000;

	    res = fetcher.fetchAndExtract(link, timeout_ms, true);
	}
	
	catch (Exception e){
	    LOGGER.error(e.toString());
            return Response.status(Response.Status.NOT_ACCEPTABLE).build();
	}

	String text = res.getText(); 

	return Response.status(Response.Status.OK).entity(text).build();	
    }

}
