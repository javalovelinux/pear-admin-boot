package com.pearadmin.video.mapper;

import com.pearadmin.video.domain.ArticleCategories;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ArticleCategoriesMapper {
    List<ArticleCategories> findAllCategorys();
}
