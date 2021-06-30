package com.onemount.onefast.controller.api;

import com.onemount.onefast.model.News;
import com.onemount.onefast.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/public/news")
public class NewsController {
    @Autowired
    private NewsService newsService;

    @GetMapping("/all")
    public ResponseEntity<List<News>> getAllNews() {
        return ResponseEntity.ok().body(newsService.findAll());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<News> getNewsById(@PathVariable Long id) {
        return ResponseEntity.ok().body(newsService.findById(id));
    }

}
