package ru.hogwarts.school.controller;

import org.springframework.web.bind.annotation.*;
import ru.hogwarts.school.model.Student;
import ru.hogwarts.school.service.StudentService;

import java.util.Collection;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/{id}")
    public Student getStudent(@PathVariable Long id){
        return studentService.getStudent(id);
    }
    @PostMapping
    public Student createStudent (@RequestBody Student student){
        return studentService.addStudent(student);
    }
    @PutMapping("/{id}")
    public  Student updateStudent (@PathVariable Long id, @RequestBody Student student) {
        return studentService.updateStudent(id, student);
    }

    @DeleteMapping("/{id}")
    public void removeStudent(@PathVariable Long id){
        studentService.removeStudent(id);
    }


    @GetMapping(params = "age")
    public Collection<Student> getStudentByAge(@RequestParam Integer age){
        return studentService.getStudentsByAge(age);
    }
}
