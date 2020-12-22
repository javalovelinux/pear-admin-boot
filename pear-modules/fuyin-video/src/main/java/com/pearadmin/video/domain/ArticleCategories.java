package com.pearadmin.video.domain;

import lombok.Data;
import lombok.ToString;
import org.apache.ibatis.type.Alias;

@ToString
@Data
@Alias("ArticleCategories")
public class ArticleCategories {
    private int id;
    private String name;
    private String des;
    private Byte isDisplay;
    private Integer parentId;
}
