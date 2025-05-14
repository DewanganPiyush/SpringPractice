package com.healthcatalyst.main.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfigFile {
    @Bean
    public Address createAddress() {
        Address address = new Address(200, "Bhilai", 490089);
//        Address address = new Address();
//
//        address.setHouseno(56);
//        address.setCity("Delhi");
//        address.setPincode(492334);

        return address;
    }

    @Bean
    public Student createStudent() {
        Student st = new Student("Piyush", 45, createAddress());
//        Student st = new Student();
//
//        st.setRollno(34);
//        st.setName("Piyush");
//        st.setAdresss(createAddress());

        return st;
    }
}
