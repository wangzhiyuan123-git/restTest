package example;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.xml.ws.Endpoint;
@WebService
@Path("/hello")
public class HelloWorld {

    @GET
    @Produces()
    @Path("/{word}")
    public String sayHelloWorldFrom(@PathParam("word") String word) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 3; i++) sb.append(i + word);
        String s = sb.toString();
        return s;
    }
//  public static void main(String[] argv) {
//    Object implementor = new HelloWorld ();
//    String address = "http://localhost:9000/HelloWorld";
//    Endpoint.publish(address, implementor);
//  }
}
