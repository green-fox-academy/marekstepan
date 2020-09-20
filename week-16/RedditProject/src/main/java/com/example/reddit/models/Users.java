package com.example.reddit.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Users {
  //cannot use word "user" for jpa entity using Postgres - it is reserved. I could probably specify a name....

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private long id;
  private String uname;
  private String email;
  private String password;

    public Users() {
    }

    public Users(String uname, String email, String password) {
      this.uname = uname;
      this.email = email;
      this.password = password;
    }

  public Users(long id, String uname, String email, String password) {
    this.id = id;
    this.uname = uname;
    this.email = email;
    this.password = password;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getUname() {
    return uname;
  }

  public void setUname(String uname) {
    this.uname = uname;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}
