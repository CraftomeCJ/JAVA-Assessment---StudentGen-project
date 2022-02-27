package com.generation.model;

import java.util.List;

public class Course
{
    private final String code;
    private final String name;
    private final int credits;
    private final Module module;
    private String student;

    public Course( String code, String name, int credits, Module module )
    {
        this.code = code;
        this.name = name;
        this.credits = credits;
        this.module = module;
    }

    public String getCode()
    {
        return code;
    }

    public String getName()
    {
        return name;
    }

    public int getCredits()
    {
        return credits;
    }

    public String getStudent()
    {
        return student;
        
    }

    public Module getModule()
    {
        return module;
    }

    @Override
    public String toString()
    {
        return "Course{" + "code='" + code + '\'' + ", name='" + name + '\'' + ", credits=" + credits + ", module="
            + module + '}';
    }

    public List<Course> getStudents() {
      return null;
    }

    public String getEnrolledStudents() {
      return null;
    }

    public float getGrade() {
      return 0;
    }

    public Object getId() {
      return null;
    }
}
