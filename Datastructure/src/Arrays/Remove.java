package Arrays;

import javax.swing.*;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student implements Comparable<Student>
{
    int rollNo;
    String name;
    int age;
    Student(int rollno,String name,int age)
    {
        this.rollNo=rollno;
        this.name=name;
        this.age=age;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Student o) {
        if(this.rollNo>o.getRollNo()) return 1;
        else if(this.getRollNo()<o.getRollNo()) return -1;
        else return 0;
    }
}



 class ExampleOfComparable
{
    public static void main(String args[])
    {
        ArrayList<Student> listOfStudent = new ArrayList<Student>();
        listOfStudent.add(new Student(1,"ravi",26));
        listOfStudent.add(new Student(25,"kant",27));
        listOfStudent.add(new Student(3,"bamboj",20));
        listOfStudent.add(new Student(0,"lamboj",20));
        listOfStudent.add(new Student(30,"aamboj",20));


        // It Sorts all the objects based on RollNo
        Collections.sort(listOfStudent, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {

                return o1.getName().compareTo(o2.getName());
            }
        });
    for(Student student:listOfStudent)
        {

            System.out.println("Name of Student = "+student.name);
        }
    }
}
