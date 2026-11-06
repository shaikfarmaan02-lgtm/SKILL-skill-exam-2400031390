package com.Soa.Task.Service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Soa.Task.Entity.Faculty;
import com.Soa.Task.Repository.FacultyRepository;
@Service
public class FacultyServiceImpl implements FacultyService{
	@Autowired
	private FacultyRepository frepo;

	@Override
	public Faculty savefaculty(Faculty faculty) {

        faculty.setCreatedat(LocalDateTime.now());
        faculty.setUpdatedat(LocalDateTime.now());
		return frepo.save(faculty);
	}

	@Override
	public Faculty updatefaculty(Long facultyid,Faculty faculty) {
		Faculty existingFaculty = frepo.findById(facultyid)
	            .orElseThrow(() -> new RuntimeException("Faculty not found"));

	    existingFaculty.setName(faculty.getName());
	    existingFaculty.setType(faculty.getType());
	    existingFaculty.setStatus(faculty.getStatus());
	    existingFaculty.setLocation(faculty.getLocation());

	 

	    return frepo.save(existingFaculty);

	}



	@Override
	public List<Faculty> getAllFaculty() {
		  return frepo.findAll();
	}

	@Override
	public Faculty getFacultyById(Long facultyId) {
	    return frepo.findById(facultyId)
	            .orElseThrow(() -> new RuntimeException("Faculty not found"));
	}

	@Override
	public List<Faculty> findByName(String name) {
		   return frepo.findByName(name);
	}

	@Override
	public List<Faculty> findByType(String type) {

	    return frepo.findByType(type);
	}

	@Override
	public String deletefaculty(Long facultyid) {
		boolean n=frepo.existsById(facultyid);
		if(n)
		{
			frepo.deleteById(facultyid);
			return "Deleted Successfully";
		}
		else
		{
			return "Id Not Found";
		}
	
	}
		

}
