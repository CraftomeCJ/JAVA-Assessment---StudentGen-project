package com.generation.service;

import com.generation.model.Course;
import com.generation.model.Student;

import java.util.*;

public class StudentService
{
    private final Map<String, Student> students = new HashMap<>();

    public void subscribeStudent( Student student )
    {
        students.put( student.getId(), student );
    }

    public Student findStudent( String studentId )
    {
        //COOKED write a method that will find a student by studentId
        //@return the student with the given id
        return students.get(studentId);
    }

    public boolean showSummary()
    {
        //TODO write a boolean method that will showSummary() of all studentId's that are enrolled in a course
        //@return true if the student is enrolled in a course, false otherwise
        if (students.isEmpty())
        {
            return false;
        }
        else
        {
            for (Student student : students.values())
            {
                if (student.getEnrolledCourses().size() > 0)
                {
                    return true;
                }
            }
        }
        return false;
    }


    public void enrollToCourse(String studentId, Course course )
    {
    //write a if else method that will enroll a student to a course
    //@param studentId the student id
    //@param course the course to enroll to
    //@return true if the student is enrolled in the course, false otherwise
        Student student = findStudent(studentId);
      if (studentId != null) {
        if (course.getEnrolledStudents().contains(student))
            {
                System.out.println("Student is already enrolled in this course");
            }
            else
            {
                course.getEnrolledStudents().contentEquals(student);
                student.getEnrolledCourses().add(course);
                System.out.println("Student enrolled in course");
            }
        } else {
            System.out.println("Student not found");
        }

    }
}
