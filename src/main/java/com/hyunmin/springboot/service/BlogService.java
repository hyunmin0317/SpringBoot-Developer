package com.hyunmin.springboot.service;

import com.hyunmin.springboot.domain.Article;
import com.hyunmin.springboot.dto.AddArticleRequest;
import com.hyunmin.springboot.repository.BlogRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@RequiredArgsConstructor
@Service
public class BlogService {
    private final BlogRepository blogRepository;

    public Article save(AddArticleRequest request) {
        return blogRepository.save(request.toEntity());
    }
}
