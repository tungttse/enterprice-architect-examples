/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.miu.cs544.tttruong;

import edu.miu.cs544.tttruong.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 *
 * @author Thanh Tung Truong <tttruong@miu.edu>
 */

@Configuration
@PropertySource("classpath:application.properties")
public class ConfigData {
    @Autowired
    private Environment env;

    public String readProperty() {
        return env.getProperty("hello.name");
    }

}
