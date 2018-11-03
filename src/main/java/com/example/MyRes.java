package com.example;

/**
 * Root resource (exposed at "myresource" path)
 */
// 子资源没有 @Path
public class MyRes {

    private String info = "this is res test.";

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
