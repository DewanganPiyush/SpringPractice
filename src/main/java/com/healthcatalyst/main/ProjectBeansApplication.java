package com.healthcatalyst.main;

import com.healthcatalyst.main.beans.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProjectBeansApplication implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        studentBean().displayStudentDetails();
    }

    public static void main(String[] args) {
        SpringApplication.run(ProjectBeansApplication.class, args);
    }

    @Bean
    public Student studentBean(){
        return new Student("Piyush",24,89.8f);
    }
}
