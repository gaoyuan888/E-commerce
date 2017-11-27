package com.taotao.sso.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taotao.common.pojo.TaotaoResult;
import com.taotao.common.utils.ExceptionUtil;
import com.taotao.sso.service.UserService;

@Controller("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/check/{param}/{type}")
	@ResponseBody
	public Object checkData(@PathVariable String param, @PathVariable Integer type, String callback) {

		TaotaoResult result = null;
		// 参数有效性校验
		if (StringUtils.isBlank(param)) {
			result = TaotaoResult.build(400, "参数内容不能为空");
		}
		if (type == null) {
			result = TaotaoResult.build(400, "参数内容类型不能为空");
		}
		if (type != 1 && type != 2 && type != 3) {
			result = TaotaoResult.build(400, "参数内容类型错误");
		}

		if (null != result) {
			if (null != callback) {
				MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(result);
				mappingJacksonValue.setJsonpFunction(callback);
				return mappingJacksonValue;
			} else {
				return result;
			}
		}
		try {
			result = userService.checkData(param, type);
		} catch (Exception e) {
			result = TaotaoResult.build(500, ExceptionUtil.getStackTrace(e));
		}
		if (null != callback) {
			MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(result);
			mappingJacksonValue.setJsonpFunction(callback);
			return mappingJacksonValue;
		} else {
			return result;
		}
	}
}
