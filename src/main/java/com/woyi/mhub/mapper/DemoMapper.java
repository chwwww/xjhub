package com.woyi.mhub.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.woyi.mhub.domain.DemoEntity;

public interface DemoMapper {
	
	@Select("SELECT * FROM demo")
	@Results({ @Result(property = "passWord", column = "pass_word") })
	List<DemoEntity> getAll();

	@Select("SELECT * FROM demo WHERE id = #{id}")
	@Results({ @Result(property = "passWord", column = "pass_word") })
	DemoEntity getOne(Long id);

	@Insert("INSERT INTO demo(id,pass_word,name) VALUES(#{id}, #{passWord}, #{name})")
	int insert(DemoEntity demo);

	@Update("UPDATE demo SET name=#{name},pass_word=#{passWord} WHERE id =#{id}")
	int update(DemoEntity demo);

	@Delete("DELETE FROM demo WHERE id =#{id}")
	int delete(Long id);
}
