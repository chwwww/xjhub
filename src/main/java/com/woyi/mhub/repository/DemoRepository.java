package com.woyi.mhub.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.woyi.mhub.domain.DemoEntity;

public interface DemoRepository extends JpaRepository<DemoEntity, Serializable>{
	
}
