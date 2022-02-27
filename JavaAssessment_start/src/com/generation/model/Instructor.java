package com.generation.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//This class is responsible for keeping the track instructor
public class Instructor
    extends Person
{

    private int experienceMonths;

    private final List<Course> teachingCourses = new ArrayList<>();
// add the courses to the instructor teachingCourses list for the user to choose
    public void addCourse( Course course )
    {
        teachingCourses.add( course );
    }


    protected Instructor( String id, String name, String email, Date birthDate )
    {
        super( id, name, email, birthDate );
    }

    public int getExperienceMonths()
    {
        return experienceMonths;
    }

    public void setExperienceMonths( int experienceMonths )
    {
        this.experienceMonths = experienceMonths;
    }

    @Override
    public String toString() {
        return "Instructor{" + super.toString() + "experienceMonths=" + experienceMonths + '}';
    }
}
