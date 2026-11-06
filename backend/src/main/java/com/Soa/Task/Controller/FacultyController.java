package com.Soa.Task.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Soa.Task.Entity.Faculty;
import com.Soa.Task.Service.FacultyService;

@RestController

public class FacultyController {
	@Autowired
	private FacultyService service;
	@PostMapping("/save")
	public Faculty savefaculty(@RequestBody Faculty faculty) {
		return service.savefaculty(faculty);
	}
	@PutMapping("/update/{facultyid}")
	public Faculty updatefaculty(@PathVariable Long facultyid, @RequestBody Faculty  faculty) {
		return service.updatefaculty(facultyid, faculty);
	}
	@DeleteMapping("/delete/{facultyid}")
	public String deleteFaculty(@PathVariable Long facultyid) {

	    return service.deletefaculty(facultyid);

	   
	}
	@GetMapping("/displayall")
	public List<Faculty> getAllFaculty() {
	    return service.getAllFaculty();
	}
	@GetMapping("/get/{facultyid}")
	public Faculty getFacultyById(@PathVariable Long facultyid) {

	    return service.getFacultyById(facultyid);
	}
	@GetMapping("/name/{name}")
	public List<Faculty> findByName(@PathVariable String name) {

	    return service.findByName(name);
	}
	@GetMapping("/type/{type}")
	public List<Faculty> findByType(@PathVariable String type) {

	    return service.findByType(type);
	}
	
	

}
