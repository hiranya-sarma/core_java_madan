package com.designpatterns.mypractice.structural.composite;

import java.util.List;

/**
 * The Composite Pattern in Java can be implemented using the Component class as an abstract class or an interface.
 * In this example, we will use an abstract class which contains all the important methods used in a composite class
 * and a leaf class.
 */

public abstract class HtmlTag {

    public abstract String getTagName();

    public abstract void setStartTag(String tag);

    public abstract void setEndTag(String tag);

    public void setTagBody(String tagBody) {
        throw new UnsupportedOperationException("Current operation is not support for this object");
    }

    public void addChildTag(HtmlTag tag) {
        throw new UnsupportedOperationException("Current operation is not support for this object");
    }

    public void removeChildTag(HtmlTag tag) {
        throw new UnsupportedOperationException("Current operation is not support for this object");
    }

    public List<HtmlTag> getChildren() {
        throw new UnsupportedOperationException("Current operation is not support for this object");
    }

    public abstract void generateHtml();

}
