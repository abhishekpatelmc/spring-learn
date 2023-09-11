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
                    LocalDate.of(1999, 5, 15)
            );

            Student alex = new Student(
                    "Alex",
                    "alex@gmail.com",
                    LocalDate.of(2000, 3, 26)
            );

            studentRepository.saveAll(
                    List.of(abhishek, alex)
            );
        };
    }
}
