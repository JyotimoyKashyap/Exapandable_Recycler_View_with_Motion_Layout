package com.example.testapp.model;

public class Model {

    private String heading;
    private String context;

    public Model(String heading, String context) {
        this.heading = heading;
        this.context = context;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }
}
