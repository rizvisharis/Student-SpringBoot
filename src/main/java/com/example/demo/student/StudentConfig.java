package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.DECEMBER;
import static java.time.Month.NOVEMBER;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student rizvi = new Student(
                    1L,
                    "Rizvi",
                    "rizvisharis@gmail.com",
                    LocalDate.of(1993, NOVEMBER, 23)
            );

            Student sharis = new Student(
                    2L,
                    "Sharis",
                    "sharis@gmail.com",
                    LocalDate.of(1994, DECEMBER, 23)
            );
            repository.saveAll(
                    List.of(rizvi,sharis)
            );
        };
    }
}
