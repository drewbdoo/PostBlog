package com.springBootCRUD.repository;

import com.springBootCRUD.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
