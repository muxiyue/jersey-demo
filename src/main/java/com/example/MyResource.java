package com.example;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Got it!";
    }

    // 子资源必须要有Path 但是没有 @HttpMethod
    @Path("sub")
    public MySubResource getMySubResource() {
        return new MySubResource();
    }


    // 子资源必须要有Path 但是没有 @HttpMethod，这个只是一个普通呃请求
    @GET
    @Path("sub2")
    @Produces(MediaType.APPLICATION_JSON)
    public MySubResource getResInfo() {
        return new MySubResource();
    }


    // 子资源必须要有Path 但是这个对象里面没有匹配到请求，404 @HttpMethod 会被忽略掉
    @Path("sub3")
    public String getRes() {
        return "will.be.404";
    }
}
