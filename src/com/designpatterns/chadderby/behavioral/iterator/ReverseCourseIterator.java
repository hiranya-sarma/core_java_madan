package com.designpatterns.chadderby.behavioral.iterator;

import java.util.List;
import java.util.NoSuchElementException;

public class ReverseCourseIterator implements PatternIterator<Course> {
    private List<Course> courses;
    private int index = 0;

    public ReverseCourseIterator(List<Course> courses) {
        this.courses = courses;
        index = courses.size() - 1; //starts at the end
    }

    @Override
    public boolean hasNext() {
        return index >= 0; //stops at beginning
    }

    @Override
    public Course next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Course course = courses.get(index);
        index--;
        return course;
    }
}
