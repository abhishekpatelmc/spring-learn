package com.xcal.springlearn.spring.learn;

import java.time.LocalDate;
import java.util.List;

import com.xcal.springlearn.spring.learn.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringLearnApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringLearnApplication.class, args);
	}

	@GetMapping
	public List<Student> hello(){
		return List.of(
				new Student(
						1L,
						"Abhishek",
						"abhishek@gmail.com",
						21,
						LocalDate.of(2000, 10, 10)
				)
		);
	}

}
