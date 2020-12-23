package com.pearadmin.video.service.impl;

import com.aliyun.oss.ClientBuilderConfiguration;
import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.aliyun.oss.model.PutObjectResult;
import com.pearadmin.common.config.proprety.OssUploadProperty;
import com.pearadmin.common.plugins.resource.domain.File;
import com.pearadmin.video.service.IOSSFileService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Date;
import java.util.List;

@Service
public class OssFileServiceImpl implements IOSSFileService {
    /**
     * 阿 里 云 文 件 上 传 可 读 配 置
     * */
    @Resource
    private OssUploadProperty ossUploadProperty;
    @Override
    public String upload(MultipartFile file) {
        // 创建ClientConfiguration实例，您可以按照实际情况修改默认参数。
        ClientBuilderConfiguration conf = new ClientBuilderConfiguration();
        // 设置是否支持CNAME。CNAME是指将自定义域名绑定到存储空间上。
        conf.setSupportCname(true);

        // 创建OSSClient实例。
        OSS ossClient = new OSSClientBuilder().build(
                ossUploadProperty.getEndpoint(),
                ossUploadProperty.getAccessKeyId(),
                ossUploadProperty.getAccessKeySecret(),
                conf);
        URL uri = null;
        try {
            InputStream is = file.getInputStream();

            PutObjectResult putObjectResult = ossClient.putObject(
                    ossUploadProperty.getBucket(),
                    file.getOriginalFilename(),
                     is);
            Date expiration = new Date(new Date().getTime() + 3600l * 1000 * 24 * 365 * 10);
            uri = ossClient.generatePresignedUrl(
                    ossUploadProperty.getBucket(),
                    file.getOriginalFilename(),
                    expiration);
            int code = putObjectResult.getResponse().getStatusCode();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return uri.getPath();
    }

    @Override
    public void download(String id) {

    }

    @Override
    public List<File> data() {
        return null;
    }

    @Override
    public boolean remove(String id) {
        return false;
    }

    @Override
    public List<String> fileDirs() {
        return null;
    }
}
