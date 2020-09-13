package com.example.reddit.services;

import com.example.reddit.models.Post;
import com.example.reddit.repositories.PostRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService{
  private final PostRepository postRepository;

  @Autowired
  public PostServiceImpl(PostRepository postRepository) {

    this.postRepository = postRepository;
  }

  @Override
  public List<Post> findAllSortedByScore() {

    return postRepository.getAllByOrderByScoreDesc();
  }

  @Override
  public void add(String title, String url) {

    postRepository.save(new Post(title, url));
  }

  @Override
  public void deleteById(long id) {

    postRepository.deleteById(id);
  }

  @Override
  public Post findById(long id) {

    return postRepository.findById(id).orElse(null);
  }

  @Override
  public void voteById(Long id, Integer scoreChangeValue) {
    Post post = postRepository.getOne(id);
    post.setScore(post.getScore() + scoreChangeValue);
    postRepository.save(post);
  }

}
