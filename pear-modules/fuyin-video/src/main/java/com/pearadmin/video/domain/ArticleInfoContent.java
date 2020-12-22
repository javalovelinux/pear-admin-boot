package com.pearadmin.video.domain;

import lombok.Data;
import lombok.ToString;
import org.apache.ibatis.type.Alias;

import java.sql.Timestamp;


@ToString
@Data
@Alias("article_info_content")
public class ArticleInfoContent {
    private int id;
    private int articleInfoId;
    private String content;
}
