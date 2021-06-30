package com.onemount.onefast.service;

import com.onemount.onefast.exception.CustomException;
import com.onemount.onefast.model.News;
import com.onemount.onefast.repository.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NewsServiceImpl implements NewsService{

    @Autowired
    private NewsRepository newsRepository;

    @Override
    public List<News> findAll() {
        return newsRepository.findAll();
    }

    @Override
    public News findById(Long id) {
        Optional<News> optionalNews = newsRepository.findById(id);
        if (optionalNews.isPresent()) {
            return optionalNews.get();
        } else {
            throw new CustomException("Can not find news!", HttpStatus.NOT_FOUND);
        }
    }
}
