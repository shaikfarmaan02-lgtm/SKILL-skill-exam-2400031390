package com.Soa.Task.Service;

import java.util.List;

import com.Soa.Task.Entity.Faculty;

public interface FacultyService {
Faculty savefaculty(Faculty faculty);
Faculty updatefaculty(Long facultyid,Faculty faculty);
String deletefaculty(Long facultyid);
List<Faculty> getAllFaculty();
Faculty getFacultyById(Long facultyId);
List<Faculty> findByName(String name);
List<Faculty> findByType(String type);

}