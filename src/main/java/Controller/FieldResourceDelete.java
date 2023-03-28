package Controller;

import Model.Channel;

import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("fieldDelete")
public class FieldResourceDelete {
    @GET()
    @Path("truncate")
    @Transactional
    public String deleteAllData(){
        Integer result = (int) Channel.deleteAll();
        return result.toString();
    }

}
