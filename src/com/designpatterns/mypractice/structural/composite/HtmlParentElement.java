package com.designpatterns.mypractice.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class HtmlParentElement extends HtmlTag{

    private String tagName;
    private String startTag;
    private String endTag;
    private List<HtmlTag> childrenTag;

    public HtmlParentElement(String tagName){
        this.tagName = tagName;
        this.startTag = "";
        this.endTag = "";
        this.childrenTag = new ArrayList<>();
    }

    @Override
    public String getTagName() {
        return tagName;
    }

    @Override
    public void setStartTag(String tag) {
        this.startTag = tag;
    }

    @Override
    public void setEndTag(String tag) {
        this.endTag = tag;
    }

    @Override
    public void addChildTag(HtmlTag htmlTag) {
        this.childrenTag.add(htmlTag);
    }

    @Override
    public void removeChildTag(HtmlTag htmlTag) {
        this.childrenTag.remove(htmlTag);
    }

    @Override
    public List<HtmlTag> getChildren() {
        return this.childrenTag;
    }

    @Override
    public void generateHtml() {
       System.out.println(startTag);
       for(HtmlTag htmlTag : this.childrenTag){
           htmlTag.generateHtml();
       }
       System.out.println(endTag);
    }

}







































