package com.mybooks.entity;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * # Getter/Setter
 * # 有参/无参构造
 * @author Administrator
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
	private Integer id;
	private String name;
	private byte age;
	private Date bornDate;
	private String headImg;
	/*
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public byte getAge() {
		return age;
	}
	public void setAge(byte age) {
		this.age = age;
	}
	public Date getBornDate() {
		return bornDate;
	}
	public void setBornDate(Date bornDate) {
		this.bornDate = bornDate;
	}
	public String getHeadImg() {
		return headImg;
	}
	public void setHeadImg(String headImg) {
		this.headImg = headImg;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + ", bornDate=" + bornDate + ", headImg=" + headImg
				+ "]";
	}
	public User(Integer id, String name, byte age, Date bornDate, String headImg) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.bornDate = bornDate;
		this.headImg = headImg;
	}
	public User() {
		super();
	}
	*/
	
}
