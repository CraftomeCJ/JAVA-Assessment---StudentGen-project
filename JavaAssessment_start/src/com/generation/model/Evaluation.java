package com.generation.model;

import java.util.List;

public interface Evaluation
{
    List<Course> findPassedCourses();

    List<Course> getEnrolledCourses();
}
