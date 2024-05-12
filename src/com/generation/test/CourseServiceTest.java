package com.generation.test;

import com.generation.model.Student;
import com.generation.service.CourseService;
import com.generation.service.StudentService;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CourseServiceTest {


    @Test
    void getCourse() {
        // There should be a default INTRO-CS-1 course with the correct name.
        CourseService courseService = new CourseService();
        assertEquals("INTRO-CS-1", courseService.getCourse("INTRO-CS-1").getCode());
        assertEquals("Introduction to Computer Science", courseService.getCourse("INTRO-CS-1").getName());
    }

    @Test
    void countStudents() {
        CourseService courseService = new CourseService();

        // By default should have no students registered.
        assertEquals(0, courseService.countStudents());

        // Should return 1 after registering a student and enrolling him
        Student student = new Student("1", "John Doe", "johndoe@gmail.com", new Date());
        courseService.enrollStudent("INTRO-CS-1", student);
        assertEquals(1, courseService.countStudents());
    }
}