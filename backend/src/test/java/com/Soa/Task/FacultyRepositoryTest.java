package com.Soa.Task;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.data.jpa.test.autoconfigure.DataJpaTest;
import org.springframework.boot.jdbc.test.autoconfigure.AutoConfigureTestDatabase;

import com.Soa.Task.Entity.Faculty;
import com.Soa.Task.Repository.FacultyRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class FacultyRepositoryTest {

    @Autowired
    private FacultyRepository repository;

    @Test
    void testFindAllFaculties() {
        List<Faculty> faculties = repository.findAll();

        assertNotNull(faculties);
        assertFalse(faculties.isEmpty());

        System.out.println("Total Faculties: " + faculties.size());
    }

    @Test
    void testFindFacultyById() {
        Optional<Faculty> faculty = repository.findById(1L);

        assertTrue(faculty.isPresent());
        assertEquals(1L, faculty.get().getFacultyid());

        System.out.println("Faculty ID: " + faculty.get().getFacultyid());
        System.out.println("Faculty Name: " + faculty.get().getName());
    }


    @Test
    void testFindFacultyByName() {
        List<Faculty> faculties = repository.findByName("John");

        assertNotNull(faculties);
        assertFalse(faculties.isEmpty());

        System.out.println("Faculties found: " + faculties.size());
    }

    @Test
    void testFindFacultyByType() {
        List<Faculty> faculties = repository.findByType("Teaching");

        assertNotNull(faculties);
        assertFalse(faculties.isEmpty());

        System.out.println("Faculties with Teaching type: " + faculties.size());
    }

 
    @Test
    void testTotalFacultyCount() {
        long count = repository.count();

        assertTrue(count > 0);

        System.out.println("Total Faculty Count: " + count);
    }
}