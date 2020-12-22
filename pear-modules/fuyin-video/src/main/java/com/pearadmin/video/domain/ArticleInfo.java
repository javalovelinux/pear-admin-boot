package com.pearadmin.video.domain;

import lombok.Data;
import lombok.ToString;
import org.apache.ibatis.type.Alias;

import java.sql.Timestamp;


@ToString
@Data
@Alias("article_info")
public class ArticleInfo {
    private int id;
    private String author;
    private String title;
    private String excerpt;
    private Integer categoryId;
    private Timestamp publishTime;
    private byte isTop;
    private byte isPublished;
    private String imgUrl;
    private Timestamp createdDate;
    private int reply;
    private int browse;
    private String seoDes;


}
