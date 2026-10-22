package com.designpatterns.mypractice.structural.proxy;

public class DocumentProxy implements Document {

    private final String filename;
    private final String userRole;

    private RealDocument realDocument;

    public DocumentProxy(String filename, String userRole) {
        this.filename = filename;
        this.userRole = userRole;
    }

    @Override
    public void display() {
        if(!"ADMIN".equals(userRole)) {
            throw new SecurityException( "Access denied: Insufficient permissions");
        }

        if(realDocument == null) {
            realDocument = new RealDocument(filename);
        }
        realDocument.display();

    }
}
