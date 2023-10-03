package com.hyunmin.springboot.repository;

import com.hyunmin.springboot.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BlogRepository extends JpaRepository<Article, Long> {
}
