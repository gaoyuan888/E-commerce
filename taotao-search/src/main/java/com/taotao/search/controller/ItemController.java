package com.taotao.search.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.taotao.common.pojo.TaotaoResult;
import com.taotao.search.service.ItemService;

@Controller
@RequestMapping("/manager")
public class ItemController {
	
	@Autowired
	private ItemService itemService;
	
	@RequestMapping("/importall")
	public TaotaoResult importAllTtems(){
		TaotaoResult result = itemService.importAllItems();
		return result;
	}
}
