package com.pearadmin.video.service;

import com.pearadmin.common.plugins.resource.domain.File;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface IOSSFileService {
    /**
     * 文 件 上 传 服 务
     * */
    String upload(MultipartFile file);

    /**
     * 文 件 下 载 服 务
     * */
    void download(String id);

    /**
     * 文 件 列 表
     * */
    List<File> data();

    /**
     * 删 除 文 件
     * */
    boolean remove(String id);

    /**
     * 文 件 夹 列 表
     * */
    List<String> fileDirs();
}
