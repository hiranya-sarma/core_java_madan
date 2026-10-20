package com.designpatterns.mypractice.behavioral.chainofresponsibility;

public interface Handler {
    public void setHandler(Handler handler);
    public void process(File file);
    public String getHandlerName();
}
