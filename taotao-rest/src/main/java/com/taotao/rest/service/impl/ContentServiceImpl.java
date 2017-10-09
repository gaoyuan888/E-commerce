package com.taotao.rest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.taotao.common.utils.JsonUtils;
import com.taotao.mapper.TbContentMapper;
import com.taotao.pojo.TbContent;
import com.taotao.pojo.TbContentExample;
import com.taotao.pojo.TbContentExample.Criteria;
import com.taotao.rest.dao.JedisClient;
import com.taotao.rest.service.ContentService;

@Service
public class ContentServiceImpl implements ContentService {

	@Autowired
	private TbContentMapper contentMapper;
	
	@Autowired
	private JedisClient jedisClient;
	
	@Value("${INDEX_CONTENT_REDIS_KEY}")
	private String INDEX_CONTENT_REDIS_KEY;
	
	
	public List<TbContent> getContentList(long contentCid) {
		
		try{
			String reslut = jedisClient.hget(INDEX_CONTENT_REDIS_KEY, contentCid+"");
			if(!StringUtils.isEmpty(reslut)){
				List<TbContent> resultList = JsonUtils.jsonToList(reslut, TbContent.class);
				return resultList;
			} 
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		TbContentExample example=new TbContentExample();
		Criteria criteria = example.createCriteria();
		criteria.andCategoryIdEqualTo(contentCid);
		List<TbContent> result = contentMapper.selectByExample(example);
		
		try {
			String catchString=JsonUtils.objectToJson(result);
			jedisClient.hset(INDEX_CONTENT_REDIS_KEY, contentCid+"", catchString);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}

}
