package com.company;

import java.util.ArrayList;
import java.util.List;

public class Blog {
  public List<BlogPost> posts = new ArrayList<>();

  public void addNewPost(BlogPost post){
    this.posts.add(post);
    }

  public void deletePost(int postIndex){
    this.posts.remove(postIndex);


  public void updatePost(int postIndex, BlogPost post){
    this.posts.set(postIndex, post);
  }
}