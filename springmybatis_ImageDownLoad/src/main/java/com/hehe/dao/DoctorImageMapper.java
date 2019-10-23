package com.hehe.dao;

import com.hehe.pojo.DoctorImage;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface DoctorImageMapper {
    DoctorImage getImage(@Param(value = "id") int id);

    int getDoctorId(@Param(value = "id") int id);
}
