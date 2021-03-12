package edu.miu.cs544.tttruong.jms;

import edu.miu.cs544.tttruong.domain.Student;
import edu.miu.cs544.tttruong.repositories.StudentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.jms.annotation.JmsListener;

import javax.validation.Valid;

@Component
public class StudentConsumer {
    private Logger log = LoggerFactory.getLogger(StudentConsumer.class);

    private StudentRepository studentRepository;

    public StudentConsumer(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    @JmsListener(destination = "${student.jms.name}", containerFactory = "jmsFactory")
    public void processStudent(@Valid Student student){
        log.info("===Consumer > " + student);
        log.info("===Student created " + this.studentRepository.save(student));
    }
}
