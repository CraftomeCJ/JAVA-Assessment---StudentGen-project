package com.generation.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Student
    extends Person
    implements Evaluation, CharSequence
{

    float PASS_MIN_GRADE = 3.0f;

    public Student( String id, String name, String email, Date birthDate )
    {
        super( id, name, email, birthDate );
    }


    public Object enrollToCourse(Course course )
    {
        /*
        TODO write a void method for each student to the course
        @param course the course to enroll to
        @return true if the student is enrolled in the course, false otherwise
        */
        if (course.getEnrolledStudents().contains(this)) {
            boolean b = false;
            return b;
        } else
        {
            course.getEnrolledStudents();
            return true;
        }
    }

    @Override
    public List<Course> findPassedCourses()
    {
        //TODO write a list of courses that the student passed in as a result of the evaluation
        //@return the list of courses that the student passed in
        if (getEnrolledCourses().isEmpty())
        {
            return null;
        }
        else
        {
            List<Course> passedCourses = new ArrayList<>();
            for (Course course : getEnrolledCourses())
            {
                if (course.getGrade() >= PASS_MIN_GRADE)
                {
                    passedCourses.add(course);
                }
            }
            return passedCourses;
        }
    }

    public Course findCourseById( String courseId )
    {
        //TODO write a method that will find a course by courseId
        //@return the course with the given id
        if (getEnrolledCourses().isEmpty())
        {
            return null;
        }
        else
        {
            for (Course course : getEnrolledCourses())
            {
                if (course.getId().equals(courseId))
                {
                    return course;
                }
            }
        }
        return null;
    }

    @Override
    public List<Course> getEnrolledCourses()
    {
        //TODO write a override method that will return the list of courses
        //@return the course list student had enrolled
        return getEnrolledCourses();
    }

    @Override
    public String toString()
    {
        return "Student {" + super.toString() + "}";
    }

    @Override
    public char charAt(int arg0) {
      // TODO
      return 0;
    }

    @Override
    public int length() {
      // TODO
      return 0;
    }

    @Override
    public CharSequence subSequence(int arg0, int arg1) {
      // TODO 
      return null;
    }

}
