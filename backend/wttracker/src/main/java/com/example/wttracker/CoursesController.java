package com.example.wttracker;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.wttracker.entities.Course;

@RestController
@CrossOrigin()
public class CoursesController {
	
	@Autowired
	CourseRepo courseRepo;
	
	@RequestMapping("/courses")
	public List<Course> fetchAllCourses(){
//		Course course1 = new Course("Angular", "Framework from Google!!");
//		Course course2 = new Course("React", "Library from Facebook!!");
//		
//		List<Course> courses = new ArrayList<>();
		
//		courses.add(course1); courses.add(course2);
		
		return courseRepo.findAll();
	}
	
	@RequestMapping(path="/courses", method=RequestMethod.POST)
	public ResponseEntity<Void> addCourse(@RequestBody Course course){
		courseRepo.save(course);
		return new ResponseEntity<>(HttpStatus.CREATED);
		
	}

}
