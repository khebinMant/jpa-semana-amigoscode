package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    CommandLineRunner comaCommandLineRunner(IStudentRepository iStudentRepository){
        return args ->{
            Student stu = new Student("Maria","Jone","maria@smotmehgin.com",22 );
            iStudentRepository.save(stu);
        };
    }


}
