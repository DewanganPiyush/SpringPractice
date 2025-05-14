package com.healthcatalyst.main;

import com.healthcatalyst.main.beans.SpringConfigFile;
import com.healthcatalyst.main.beans.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
//public class ProjectBeansApplication implements CommandLineRunner {
public class ProjectBeansApplication{
//    @Override
//    public void run(String... args) throws Exception {
//        studentBean().displayStudentDetails();
//    }

    public static void main(String[] args) {

        //SpringApplication.run(ProjectBeansApplication.class, args);
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);

        Student student = context.getBean(Student.class);
        student.displayStudentDetails();

    }

//    @Bean
//    public Student studentBean(){
//        return new Student("Piyush",24,89.8f);
    }

