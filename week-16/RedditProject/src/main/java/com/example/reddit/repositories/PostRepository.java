package com.example.reddit.repositories;

import com.example.reddit.models.Post;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
  List<Post> getAllByOrderByScoreDesc();
}
