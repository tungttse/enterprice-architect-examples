/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.miu.cs544.tttruong.repositories;

import edu.miu.cs544.tttruong.domain.Student;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Thanh Tung Truong <tttruong@miu.edu>
 */

//@Repository("studentRepository")
//@Repository
public interface StudentRepository extends CrudRepository<Student,Long> {
//    public List<Student> findByItem(String item);
    
    @Query("SELECT e FROM Student e WHERE e.gpa >= :gpa")
    public List<Student> listStudentWithGpaOver(@Param("gpa") double gpa);
}
