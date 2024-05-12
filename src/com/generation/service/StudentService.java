package com.generation.service;

import com.generation.model.Course;
import com.generation.model.Student;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class StudentService
{
    private final Map<String, Student> students = new HashMap<>();

    public void subscribeStudent( Student student )
    {
        students.put( student.getId(), student );
    }

    public Student findStudent( String studentId )
    {
        if ( students.containsKey( studentId ) )
        {
            return students.get( studentId );
        }
        return null;
    }

    public boolean isSubscribed( String studentId )
    {
        //TODO implement this method
        for (Entry<String, Student> entry : students.entrySet()) {
            // String (or the key) in the entry is the studentId.
            if (studentId.equals(entry.getKey()))
                return true;
        }
        return false;
    }

    public void showSummary()
    {
        //TODO implement
        System.out.println( "Registered students:" );
        for ( Entry<String, Student> entry  : students.entrySet() )
        {
            System.out.println( entry.getValue() );
        }
    }

    public void enrollToCourse( String studentId, Course course )
    {
        if ( students.containsKey( studentId ) )
        {
            students.get( studentId ).enrollToCourse( course );
        }
    }

    public void gradeStudent( String studentId, double grade )
    {
        if ( students.containsKey( studentId ) )
        {
            students.get( studentId ).setAverage( grade );
        }
    }
}
