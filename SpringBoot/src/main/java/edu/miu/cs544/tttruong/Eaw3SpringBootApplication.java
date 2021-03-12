package edu.miu.cs544.tttruong;

import edu.miu.cs544.tttruong.domain.Student;
import edu.miu.cs544.tttruong.repositories.StudentRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Eaw3SpringBootApplication  implements CommandLineRunner{

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Eaw3SpringBootApplication.class);

        app.run(args);


        
//        ConfigData cfg = app.getBean(ConfigData.class);//get the bean by type
//        System.out.println("Hello " + cfg.readProperty());
    }
    
    @Override
    public void run(String... args) throws Exception {
        System.out.println("OK running...");
    }
}
