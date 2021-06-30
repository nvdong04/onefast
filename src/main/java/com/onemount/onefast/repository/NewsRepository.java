package com.onemount.onefast.repository;

import com.onemount.onefast.model.News;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsRepository extends JpaRepository<News, Long> {

}
