package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Student student  = new Student("Datka",21);
        Student student2 = new Student("Nurmuhammad",19);
        List<Student>list = new ArrayList<>();
        list.add(student);
        list.add(student2);
        System.out.println(list);



    }
}
