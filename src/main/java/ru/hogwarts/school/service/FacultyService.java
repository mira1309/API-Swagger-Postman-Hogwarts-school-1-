package ru.hogwarts.school.service;

import ru.hogwarts.school.model.Faculty;

public interface FacultyService {
    Faculty addFaculty (Faculty faculty);

    Faculty getFaculty (Long id);

    Faculty updateFaculty (Long id, Faculty faculty);

    void removeFaculty (Long id);
}
