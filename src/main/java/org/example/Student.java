package org.example;

import java.util.List;

public class Student<Phone> {
    private int id;
    private String name;
    private List<Phone> ph;
    private Address add;

    public Student(int id, String name, List<Phone> ph, Address add) {
        this.id = id;
        this.name = name;
        this.ph = ph;
        this.add = add;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ph=" + ph +
                ", add=" + add +
                '}';
    }

    public void student(){

        System.out.println("I'm a Genspark trainee..." + add );

    }
}
