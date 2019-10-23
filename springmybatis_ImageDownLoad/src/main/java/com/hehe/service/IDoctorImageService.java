package com.hehe.service;

import com.hehe.pojo.DoctorImage;
import org.springframework.stereotype.Service;

import java.sql.Blob;

@Service
public interface IDoctorImageService {

     byte[] getImage(int id);

     int getDoctorId(int id);
}
