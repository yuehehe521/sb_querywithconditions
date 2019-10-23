package com.hehe.controller;

import com.hehe.service.IDoctorImageService;
import com.hehe.utils.FileTypeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.*;


@RestController
@RequestMapping("/")
public class MyBatisController {

	@Autowired
	private IDoctorImageService dctimg;

	@RequestMapping(value = "/file/{id}", method = RequestMethod.GET)
	public void getPhotoById(@PathVariable("id") Integer id,HttpServletResponse response)
			throws IOException {

		byte[] data = dctimg.getImage(id);
		String fileType;
		OutputStream out = response.getOutputStream();
		if (data != null && (fileType = FileTypeUtils.getFileTypeByStream(data)) != null) {
			//将图片加载到内存
			BufferedImage image = ImageIO.read(new ByteArrayInputStream(data));
//			//测试MultiPartFile（未完）
//			ByteArrayOutputStream tmpOut = new ByteArrayOutputStream();
//			tmpOut.write(data);
//			Path tmpFile = Files.createTempFile(null,null);
//			Files.copy(tmpFile,tmpOut);

			response.setContentType("image/" + fileType);
			// 输出二维码图片流
			ImageIO.write(image, fileType, out);
		}
	}

	@RequestMapping(value = "/file01/{id}", method = RequestMethod.GET)
	public void getPhotoById_01 (@PathVariable("id") int id, HttpServletResponse response)
			throws IOException {
			byte[] data = dctimg.getImage(id);
//		    //测试是否进入该方法
//		    System.out.println("id2"+dctimg.getDoctorId(id));
        //response绑定到输出流上
			try {
				if (data != null) {
					OutputStream out = response.getOutputStream();
					out.write(data);
					out.flush();
				}
			} finally {

			}
		}
}


