package org.superbiz.demo.sirona;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("rest")
public class AJAXRSService {
    @Path("sample")
    @GET
    public String doGet() {
        return "GET done";
    }
}
