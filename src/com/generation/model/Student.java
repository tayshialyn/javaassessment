package com.generation.model;

import java.util.*;
import java.util.Map.Entry;

public class Student
    extends Person
    implements Evaluation
{
    private double average;

    private final List<Course> courses = new ArrayList<Course>();

    private final Map<String, Course> approvedCourses = new HashMap<>(); // Key of this map, the string, is course code

    public Student( String id, String name, String email, Date birthDate )
    {
        super( id, name, email, birthDate );
    }

    public void enrollToCourse( Course course )
    {
        //TODO implement this method
        courses.add(course);
        registerApprovedCourse(course);
    }

    public void registerApprovedCourse( Course course )
    {

        approvedCourses.put( course.getCode(), course );
    }

    public boolean isCourseApproved( String courseCode )
    {
        //TODO implement this method
        for (Entry<String, Course> entry : approvedCourses.entrySet()) {
            // Returns true if courseCode provided to this function is within the entry of approvedCourses.
            // String (or the key) in the entry is the course code.
            if (courseCode.equals(entry.getKey()))
                return true;
        }
        return false;
    }

    // CHALLENGE IMPLEMENTATION: Read README.md to find instructions on how to solve. 
    public List<Course> findPassedCourses( Course course )
    {
        //TODO implement this method
        return null;
    }

    public boolean isAttendingCourse( String courseCode )
    {
        //TODO implement this method
        for (Entry<String, Course> entry : approvedCourses.entrySet()) {
            // Returns true if courseCode provided to this function is within the entry of approvedCourses.
            // String (or the key) in the entry is the course code.
            if (courseCode.equals(entry.getKey()))
                return true;
        }
        return false;
    }

    @Override
    public double getAverage()
    {
        return average;
    }

    @Override
    public void setAverage(double average)
    {
        this.average = average;
    }

    @Override
    public List<Course> getApprovedCourses()
    {
        //TODO implement this method
        List<Course> listApprovedCourse = new ArrayList<Course>();
        for (Entry<String, Course> entry : approvedCourses.entrySet()) {
            listApprovedCourse.add(entry.getValue());
        }
        return listApprovedCourse;
    }

    @Override
    public String toString()
    {
        return "Student {" + super.toString() + "}";
    }
}
