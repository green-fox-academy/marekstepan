package com.company;

public class Main {

    public static void main(String[] args) {
	  Teacher teacher1 = new Teacher();
	  Student student1 = new Student();
      System.out.println(Student.guestion(teacher1));
      System.out.println(Teacher.teach(student1));
    }
}
