package Controller;
import Model.Channel;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.Collections;
import java.util.List;
@Path("fieldGet")
public class FieldResourceGet {
    @GET
    public List<Channel> getAllData(){
        return Channel.listAll();
    }
}
