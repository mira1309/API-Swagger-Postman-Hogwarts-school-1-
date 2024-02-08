package ru.hogwarts.school.service;

import ru.hogwarts.school.model.Student;

import java.util.List;

public interface StudentService {
    Student addStudent (Student student);

    Student getStudent (Long id);

    Student updateStudent ( Student student);

    void removeStudent (Long id);

    List<Student> getWhenAgeBetween(Integer min, Integer max);
}
