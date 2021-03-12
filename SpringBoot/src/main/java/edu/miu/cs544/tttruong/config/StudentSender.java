package edu.miu.cs544.tttruong.config;


import edu.miu.cs544.tttruong.domain.Student;
import edu.miu.cs544.tttruong.jms.StudentProducer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class StudentSender {
    @Bean
    public CommandLineRunner sendToDos(@Value("${student.jms.name}") String name, StudentProducer producer){
        return args -> {
            producer.sendTo(name,new Student("workout tomorrow morning!"));
        };
    }
}
