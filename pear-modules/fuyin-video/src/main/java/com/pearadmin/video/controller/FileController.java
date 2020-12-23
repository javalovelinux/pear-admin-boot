package com.pearadmin.video.controller;

import com.pearadmin.common.web.domain.response.Result;
import com.pearadmin.video.service.impl.OssFileServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping(value = "fuyin/file")
public class FileController {

    @Autowired
    private OssFileServiceImpl ossFileService;

    @PostMapping(value = "upload")
    public Result upload(@RequestParam("file") MultipartFile file, HttpServletRequest request){
        Result result = new Result();

        String uri = ossFileService.upload(file);
        result.setMsg("上传成功");
        result.setData(uri);
        return result;
    }
}
