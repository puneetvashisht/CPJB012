package com.example.wttracker;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.wttracker.entities.Course;

public interface CourseRepo extends JpaRepository<Course, Integer>{

}
