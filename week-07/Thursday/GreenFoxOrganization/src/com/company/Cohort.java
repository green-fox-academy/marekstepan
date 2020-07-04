package com.company;

import java.util.ArrayList;

public class Cohort {
  String name;
  //the name of the cohort
  ArrayList <String> students = new ArrayList <String>();
  ArrayList <String> mentors = new ArrayList <String>();

  public void addStudent(String Student) {
    students.add(Student);
  }
  public void addMentor(String Mentor) {
    mentors.add(Mentor);
  }
  public void info() {
    System.out.println("The " + name + " cohort has " +  students.size() + " students and " +
        mentors.size() + " mentors.");
  }

  public Cohort(String name) {
    this.name = name;
    students.clear();
    mentors.clear();
  }
}
