package com.company;

import com.company.Person;

public class Student extends Person implements Cloneable {
  public String previousOrganization;
  public int skippedDays;

  public void getGoal() {
    System.out.println("Be a junior software developer.");
  }
  public void introduce() {
    System.out.println("Hi, I'm " + name +", a " + age + " year old " +  gender + " from " + previousOrganization +
        " who skipped " + skippedDays + " days from the course already.");
  }
  public void skipDays(int numberOfDays) {
    skippedDays = skippedDays + numberOfDays;
  }

  public Student(String name, int age, String gender, String previousOrganization) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.previousOrganization = previousOrganization;
    this.skippedDays = 0;
  }
  public Student() {
    this.name = "Jane Doe";
    this.age = 30;
    this.gender = "female";
    this.previousOrganization = "The School of Life";
    this.skippedDays=0;
  }
  @Override
  protected Object clone() throws CloneNotSupportedException {
    return super.clone();
  }
}