package org.example.coursecode.utility;

import org.example.coursecode.entity.Course;

import java.util.ArrayList;

public class courseList {

    Integer ids[] = {1, 2, 3, 4};
    String courseCodes[] = {"C001", "C002", "C003", "C004"};
    String courseNames[] = {"Java", "Python", "C++", "C#"};
    String descriptions[] = {"Java Programming", "Python Programming", "C++ Programming", "C# Programming"};
    private ArrayList<Course> courseList;
    public courseList() {
        courseList = new ArrayList<Course>();
        for (int i = 0; i < 4; i++) {
            insert(ids[i], courseCodes[i], courseNames[i], descriptions[i]);
        }
    }

    public void insert(Integer id, String courseCode, String courseName, String description) {
        Course course = new Course(id, courseCode, courseName, description);
        courseList.add(course);
    }

    public ArrayList<Course> getCourseList() {
        return courseList;
    }
}
