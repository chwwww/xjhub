package com.woyi.xjhub.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class DemoEntity implements Serializable{
	
	private static final long serialVersionUID = -958555221285003019L;

	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false)
	private String passWord;
	
	@Id
	@GeneratedValue
	private Long id;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	@Override
	public String toString() {
		return "DemoEntity [name=" + name + ", passWord=" + passWord + ", id=" + id + "]";
	}
	
}
