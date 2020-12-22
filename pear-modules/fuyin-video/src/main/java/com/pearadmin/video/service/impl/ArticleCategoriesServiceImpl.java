package com.pearadmin.video.service.impl;

import com.pearadmin.video.domain.ArticleCategories;
import com.pearadmin.video.mapper.ArticleCategoriesMapper;
import com.pearadmin.video.service.ArticleCategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ArticleCategoriesServiceImpl implements ArticleCategoriesService {
    @Autowired
    private ArticleCategoriesMapper articleCategoriesMapper;
    @Override
    public List<ArticleCategories> findAllCategorys() {
        return articleCategoriesMapper.findAllCategorys();
    }
}
