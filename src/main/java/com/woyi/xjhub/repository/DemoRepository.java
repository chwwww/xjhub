package com.woyi.xjhub.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.woyi.xjhub.domain.DemoEntity;

public interface DemoRepository extends JpaRepository<DemoEntity, Serializable>{
	
}
