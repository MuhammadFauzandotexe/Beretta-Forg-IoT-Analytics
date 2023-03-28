package Controller;
import Model.Channel;
import javax.json.JsonObject;
import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import java.time.LocalDateTime;

@Path("fieldPost")
public class FieldResourcePost {
    @GET
    @Transactional
    public String addDataViaGet(JsonObject body){
        String statusCode = null;
        Channel channel = new Channel();
        channel.Field1 = body.getString("field1");
        channel.Field2 = body.getString("field2");
        channel.Field3 = body.getString("field3");
        channel.Field4 = body.getString("field4");
        channel.Field5 = body.getString("field5");
        channel.createAt = java.time.LocalDateTime.now();
        channel.persist();
        if (channel.isPersistent()) {
            statusCode = "200";
        }
        return statusCode;
    }
    @POST
    @Transactional
    public String addDataViaPost(JsonObject body) {
        String statusCode = null;
        Channel channel = new Channel();
        channel.Field1 = body.getString("field1");
        channel.Field2 = body.getString("field2");
        channel.Field3 = body.getString("field3");
        channel.Field4 = body.getString("field4");
        channel.Field5 = body.getString("field5");
        channel.createAt = java.time.LocalDateTime.now();
        channel.persist();
        if (channel.isPersistent()) {
            statusCode = "200";
        }
        return statusCode;
    }
}
