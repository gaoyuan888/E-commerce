package com.taotao.controller;

import java.io.File;
import java.io.FileInputStream;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.junit.Test;

public class FTPTest {
	@Test
	public void testFTPClient() {

		try {
			// 创建FtpClient 对象
			FTPClient ftpClient = new FTPClient();
			// 创建FTP连接
			ftpClient.connect("192.168.226.133",21);
			//登录
			ftpClient.login("ftpuser", "111111");
			//上传文件--第一个参数为服务器端文件名，第二个参数为inputStream
			//读取本地文件
			FileInputStream inputStream=new FileInputStream(new File("C:\\Users\\Administrator\\Desktop\\考证.jpg"));
			//设置上传路径
			ftpClient.changeWorkingDirectory("/home/ftpuser/www");
			//修改上传文件的格式二进制
			ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
			ftpClient.storeFile("hello2.jpg", inputStream);
			//关闭连接
			ftpClient.logout();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
