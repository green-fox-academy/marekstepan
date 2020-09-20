package com.example.reddit.services;

import com.example.reddit.models.Post;
import java.util.List;

public interface PostService {
  List<Post> findAllSortedByScore();

  void add(String title, String url);

  void deleteById(long id);

  Post findById(long id);

  void voteById(Long id, Integer scoreChangeValue);


}
