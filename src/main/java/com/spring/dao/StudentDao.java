package com.spring.dao;

import com.spring.entity.Student;

import java.util.HashMap;
import java.util.Map;

public class StudentDao {

    private static Map<Integer, Student> students;

    static {

        students = new HashMap<Integer, Student>() {
            {
                put(1, new Student(1, "Said", "Computer Science"));
                put(1, new Student(1, "Alex", "Finance"));
                put(1, new Student(1, "Anna", "Maths"));
            }
        };

    }


}
