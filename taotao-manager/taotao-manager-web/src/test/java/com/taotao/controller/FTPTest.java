//package com.taotao.controller;
//
//import java.io.File;
//import java.io.FileInputStream;
//
//import org.apache.commons.net.ftp.FTP;
//import org.apache.commons.net.ftp.FTPClient;
//import org.junit.Test;
//import java.io.IOException;
//import java.util.HashMap;
//import java.util.Map;
//
//import org.joda.time.DateTime;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Service;
//import org.springframework.web.multipart.MultipartFile;
//
//import com.taotao.common.utils.FtpUtil;
//import com.taotao.common.utils.IDUtils;
//import com.taotao.service.PictureService;
// 
//@Service
//public class PictureServiceImpl implements PictureService {
//
//	@Value("${FTP_ADDRESS}")
//	private String FTP_ADDRESS;
//
//	@Value("${FTP_PORT}")
//	private int FTP_PORT;
//
//	@Value("${FTP_USERNAME}")
//	private String FTP_USERNAME;
//
//	@Value("${FTP_PASSWORD}")
//	private String FTP_PASSWORD;
//
//	@Value("${FTP_BASE_PATCH}")
//	private String FTP_BASE_PATCH;
//
//	@Value("${IMG_BASE_URL}")
//	private String IMG_BASE_URL;
//
//	@Override
//	public Map uploadPicture(MultipartFile uploadFile) {
//		Map resultMap = new HashMap<>();
//		try {
//			// 取出原始文件名
//			String oldName = uploadFile.getOriginalFilename();
//			// 生成一个新的文件名
//			// UUID.randomUUID();
//			String newName = IDUtils.genImageName();
//			newName = newName + oldName.substring(oldName.lastIndexOf("."));
//
//			String imagePath = new DateTime().toString("/yyyy/MM/dd");
//			boolean result = FtpUtil.uploadFile(FTP_ADDRESS, FTP_PORT, FTP_USERNAME, FTP_PASSWORD, FTP_BASE_PATCH,
//					imagePath, newName, uploadFile.getInputStream());
//
//			if (!result) {
//				resultMap.put("error", 1);
//				resultMap.put("message", "文件上传失败！");
//				return resultMap;
//			}
//			resultMap.put("error", 0);
//			resultMap.put("message", IMG_BASE_URL + imagePath + "/" + newName);
//			resultMap.put("url", IMG_BASE_URL + imagePath + "/" + newName);
//			return resultMap;
//
//		} catch (IOException e) {
//			resultMap.put("error", 1);
//			resultMap.put("message", "文件上传失败！");
//			return resultMap;
//		}
//	}
//
//}
//
//public class FTPTest {
//	@Test
//	public void testFTPClient() {
//
//		try {
//			// 创建FtpClient 对象
//			FTPClient ftpClient = new FTPClient();
//			// 创建FTP连接
//			ftpClient.connect("192.168.226.133",21);
//			//登录
//			ftpClient.login("ftpuser", "111111");
//			//上传文件--第一个参数为服务器端文件名，第二个参数为inputStream
//			//读取本地文件
//			FileInputStream inputStream=new FileInputStream(new File("C:\\Users\\Administrator\\Desktop\\考证.jpg"));
//			//设置上传路径
//			ftpClient.changeWorkingDirectory("/home/ftpuser/www");
//			//修改上传文件的格式二进制
//			ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
//			ftpClient.storeFile("hello2.jpg", inputStream);
//			//关闭连接
//			ftpClient.logout();
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//}
