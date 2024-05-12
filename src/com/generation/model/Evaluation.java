package com.generation.model;

import java.util.List;

public interface Evaluation
{
    double getAverage();
    void setAverage(double average);

    List<Course> getApprovedCourses();

}
