package com.Soa.Task.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.Soa.Task.Entity.Faculty;

public interface FacultyRepository extends JpaRepository<Faculty, Long>{
	
    List<Faculty> findByName(String name);
    List<Faculty> findByType(String type);


}