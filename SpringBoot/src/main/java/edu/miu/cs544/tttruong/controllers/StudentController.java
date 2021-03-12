/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.miu.cs544.tttruong.controllers;


import edu.miu.cs544.tttruong.domain.Student;
import edu.miu.cs544.tttruong.repositories.StudentRepository;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Thanh Tung Truong <tttruong@miu.edu>
 */

@RestController
//@EnableJpaRepositories("edu.miu.cs544.tttruong")
public class StudentController {
    private static final Logger log = LoggerFactory.getLogger(StudentController.class);

    @Autowired
    private StudentRepository repository;
    
    private void _initData(){
        Student s1 = new Student();
        s1.setName("a");
        s1.setGpa(3.5);
        
        Student s2 = new Student();
        s2.setName("b");
        s2.setGpa(4.5);
        
        Student s3 = new Student();
        s3.setName("c");
        s3.setGpa(2.9);

        repository.save(s1);
        
    }

    @RequestMapping("/")
    public String queryStudent(){

        _initData();
        Iterable<Student> iterator = repository.findAll();

        System.out.println("===All expense items: ");
        iterator.forEach(item -> System.out.println(item));

        List<Student> students = repository.listStudentWithGpaOver(3.5);
        System.out.println("===Student over 3.5 Gpa: ");
        students.forEach(item -> System.out.println(item));

        if(students.size() > 0) {
            System.out.println("===Delete a student with id = " + students.get(0).getId());
            repository.deleteById(students.get(0).getId());
        }

        return "<h1>Spring Boot Rocks </h1>";
    }
}