package com.woyi.mhub.domain;

public class DemoEntity {
	
	private String name;
	
	private String passWord;
	
	private String id;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
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
