package com.woyi.xjhub.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.woyi.xjhub.domain.DemoEntity;
import com.woyi.xjhub.repository.DemoRepository;
import com.woyi.xjhub.service.DemoService;

@Service
public class DemoServiceImpl implements DemoService{

	/*@Resource
	private DemoMapper demoMapper;*/
	
	@Resource
	private DemoRepository demoRepository;
	
	@Override
	public List<DemoEntity> getAll() {
		return demoRepository.findAll();
	}
	
	
	
}
