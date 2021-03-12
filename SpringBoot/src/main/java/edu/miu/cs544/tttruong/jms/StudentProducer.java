package edu.miu.cs544.tttruong.jms;

import edu.miu.cs544.tttruong.domain.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.jms.core.JmsTemplate;

@Component
public class StudentProducer {
    private static final Logger log = LoggerFactory.getLogger(StudentProducer.class);

    private JmsTemplate jmsTemplate;

    @Autowired
    public StudentProducer(JmsTemplate jmsTemplate){
        this.jmsTemplate = jmsTemplate;
    }

    public void sendTo(String name, Student student){
        this.jmsTemplate.convertAndSend(name, student);
        log.info("=== Message Sent");
    }
}