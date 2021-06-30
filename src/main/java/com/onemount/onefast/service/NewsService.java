package com.onemount.onefast.service;

import com.onemount.onefast.model.News;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface NewsService {
    List<News> findAll();
    News findById(Long id);
}
