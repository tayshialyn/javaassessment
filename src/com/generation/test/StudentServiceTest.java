package com.generation.test;

import com.generation.service.StudentService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {

    @Test
    void findStudent() {
        StudentService studentService = new StudentService();
        // A non-existent student should return null
        assertEquals(null, studentService.findStudent("1"));
    }


    @Test
    void isSubscribed() {
        StudentService studentService = new StudentService();
        // A non-existent student should not be subscribed
        assertEquals(false, studentService.isSubscribed("1"));
    }
}