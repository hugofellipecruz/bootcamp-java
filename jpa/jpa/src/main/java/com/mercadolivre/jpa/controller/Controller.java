package com.mercadolivre.jpa.controller;


import com.mercadolivre.jpa.model.Student;
import com.mercadolivre.jpa.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    private IStudentService stuServ;

    @PostMapping("/create")
    public String createStudent(@RequestBody Student student){
        stuServ.saveStudent(student);
        return "O aluno foi criado com sucesso";
    }

    @GetMapping("/students")
    public List<Student> getStudents(){
        List<Student> stu = stuServ.getStudents() ;
        return stu;
    }

    @PostMapping("edit/{id}")
    public Student editStudent (@PathVariable long id,
                                @RequestParam ("name") String newName,
                                @RequestParam ("lastName") String newLastName) {
        Student stu = stuServ.findStudent(id);
        stu.setLastName(newName);
        stu.setName(newLastName);
        stuServ.saveStudent(stu);
        return stu;
    }

    @DeleteMapping("student/{id}")
    public String deleteStudent(@PathVariable long id) {
        stuServ.deleteStudent(id);
        return " O aluno foi excluido com sucesso";
    }
}
