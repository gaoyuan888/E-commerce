package com.taotao.sso.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taotao.common.pojo.TaotaoResult;
import com.taotao.mapper.TbUserMapper;
import com.taotao.pojo.TbUser;
import com.taotao.pojo.TbUserExample;
import com.taotao.pojo.TbUserExample.Criteria;
import com.taotao.sso.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private TbUserMapper  userMapper;
	
	@Override
	public TaotaoResult checkData(String content, Integer type) {
		
		TbUserExample example=new TbUserExample();
		Criteria criteria = example.createCriteria();
		//校验数据
		if(1==type){
			criteria.andUsernameEqualTo(content);
		}else if(2==type){
			criteria.andPhoneEqualTo(content);
		}else{
			criteria.andEmailEqualTo(content);
		}
		//执行查询
		List<TbUser> list = userMapper.selectByExample(example);
		if(list==null||list.size()==0){
			return TaotaoResult.ok(true);
		}
		return TaotaoResult.ok(false);
	}

}
