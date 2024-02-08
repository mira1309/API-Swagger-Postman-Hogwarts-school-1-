package ru.hogwarts.school.service;

import org.springframework.stereotype.Service;
import ru.hogwarts.school.model.Faculty;
import ru.hogwarts.school.repository.FacultyRepository;

import java.util.*;
import java.util.stream.Collectors;

import static java.lang.reflect.Array.get;

@Service
public class FacultyServiceImpl implements FacultyService{
    private FacultyRepository facultyRepository;
    public FacultyServiceImpl(FacultyRepository facultyRepository) {
        this.facultyRepository = facultyRepository;
    }

    private Map<Long, Faculty> facultyMap = new HashMap<>();

    @Override
    public Faculty addFaculty(Faculty faculty) {
        return facultyRepository.save(faculty);
    }

    @Override
    public Faculty getFaculty(Long id) {
        return facultyRepository.findById(id).get();
    }

    @Override
    public Faculty updateFaculty(Long id, Faculty faculty) {
       return facultyRepository.save(faculty);
    }

    @Override
    public void removeFaculty(Long id) {
        facultyRepository.deleteById(id);

    }

    @Override
    public List<Faculty> findByColor(String color) {
        return facultyRepository.findAll().stream().filter(faculty -> faculty.getColor().equals(color)).collect(Collectors.toList());

    }
}
