package com.xcal.springlearn.spring.learn.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student abhishek = new Student(
                    "Abhishek",
                    "abhishek@gmail.com",
                    LocalDate.of(2000, 10, 10)
            );

            Student alex = new Student(
                    "Alex",
                    "alex@gmail.com",

                    LocalDate.of(2000, 5, 5)
            );

            studentRepository.saveAll(
                    List.of(abhishek, alex)
            );
        };
    }
}
