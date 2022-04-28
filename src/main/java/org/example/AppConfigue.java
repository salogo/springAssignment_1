package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration//THIS TELL THE PROGRAM WHERE TO LOOK FOR EVERYTHING THEY NEED TO RUN
public class AppConfigue {

    @Bean
    public List<Phone> phoneList(){

        List<Phone> getList = new ArrayList<>();
        getList.add(new Phone("12356"));
        getList.add(new Phone("109356"));
        getList.add(new Phone("1876"));

        return getList;
    }
    @Bean
    public Address address() {

        Address address = new Address();
        address.setCity("New York City");
        address.setState("New York");
        address.setCountry("US");
        address.setZipcode("99888");

        return address;

    }
    @Bean
    public Student student(){
        return new Student(32, "Jonh", phoneList(), address() );
    }



}
