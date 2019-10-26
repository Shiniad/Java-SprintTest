package com.mybooks.entity;

import java.util.Date;

public class Description {
	
	/**
	 * 主键
	 */
	private Long id;
	
	/**
	 * 描述
	 */
	private String description;
	
	/**
	 * 添加时间
	 */
	private Date createTime;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
}
