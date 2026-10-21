package com.designpatterns.chadderby.behavioral.iterator;

public class MainApp {
    public static void main(String[] args) {

        CourseCatalog courseCatalog = new CourseCatalog();

        courseCatalog.addCourse(new Course("Java Programming"));
        courseCatalog.addCourse(new Course("C# Programming"));
        courseCatalog.addCourse(new Course("Python Programming"));

        //get a handle to iterator
        //PatternIterator<Course> courseIterator = courseCatalog.iterator();
        PatternIterator<Course> courseIterator = courseCatalog.reverseIterator();
        while (courseIterator.hasNext()) {
            Course course = courseIterator.next();
            System.out.println(course.getName() + courseIterator.);
        }


    }
}
