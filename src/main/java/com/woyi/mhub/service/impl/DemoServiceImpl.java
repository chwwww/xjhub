package com.woyi.mhub.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.woyi.mhub.domain.DemoEntity;
import com.woyi.mhub.repository.DemoRepository;

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
