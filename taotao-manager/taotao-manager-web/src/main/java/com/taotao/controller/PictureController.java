package com.taotao.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.taotao.common.utils.JsonUtils;
import com.taotao.service.PictureService;

/**
 * 上传文件处理
 * 
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/pic")
public class PictureController {

	@Autowired
	private PictureService pictureService;

	@RequestMapping("/upload")
	@ResponseBody
	public String pictureUpload(MultipartFile uploadFile) {
		Map resultMap = pictureService.uploadPicture(uploadFile);
		String jsonRs = JsonUtils.objectToJson(resultMap);
		return jsonRs;
	}
}
