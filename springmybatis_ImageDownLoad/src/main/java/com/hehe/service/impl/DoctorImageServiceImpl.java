package com.hehe.service.impl;

import com.hehe.dao.DoctorImageMapper;
import com.hehe.pojo.DoctorImage;
import com.hehe.service.IDoctorImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DoctorImageServiceImpl implements IDoctorImageService {

    @Autowired
    private DoctorImageMapper mapper;

    //resultType="com.hehe.pojo.DoctorImage"
    // 返回的是DoctorImage对象整体，故mapper.getImage(id).getInamge()来获取到image字段
    @Override
    public byte[] getImage(int id){
        DoctorImage image =  mapper.getImage(id);
        return image != null ? image.getImage() : null;
    }

    @Override
    public int getDoctorId(int id) {
        return mapper.getDoctorId(id);
    }

}
