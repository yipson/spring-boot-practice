package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository){
        return args -> {
            Student student = new Student(
                    "Sebastian",
                    "sebastian@mail.com",
                    LocalDate.of(1999, Month.JUNE,17)
            );

            Student student2 = new Student(
                    "Alex",
                    "alex@mail.com",
                    LocalDate.of(1995, Month.DECEMBER,25)
            );

            repository.saveAll(
                    List.of(student,student2)
            );
        };
    }
}
