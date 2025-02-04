package com.java.collections;

public class NeedOfCollection {
    public static void main(String[] args) {
        // Limitations of an array
        // .1 Arrays are fixed in size
        // .2 Arrays can hold only homogeneous data elements
        Student[] students = new Student[10]; // students variable
        students[0]= new Student();
        students[1]= new Student();
        // no possible students[2]= new book();
        // object class is superclass of the all object
        Object[] objects = new Object[10];
        objects[0]= new Student();
        objects[1]= new Student();
        objects[2]= new Books();
        // .3 Ready made APIs support is not available in array
    }
}
class Books{

}
class Student{

}
