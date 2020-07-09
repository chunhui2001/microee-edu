package com.edu005joda.models;

import java.util.Date;

public class User {

	private String name; // 姓名 
	private String gender; // 性别 
	private int age; // 年龄 
	private Date birthday; // 生日 
	private String phone; // 手机号 
	private String email; // 邮箱 
	private String address; // 联系地址 
	private String[] lover; // 爱好 

    public User() {
    
    }

	/**
	 * 姓名 
	 */
	public void setName (String name) {
		this.name = name;
	} 
	/**
	 * 性别 
	 */
	public void setGender (String gender) {
		this.gender = gender;
	} 
	/**
	 * 年龄 
	 */
	public void setAge (int age) {
		this.age = age;
	} 
	/**
	 * 生日 
	 */
	public void setBirthday (Date birthday) {
		this.birthday = birthday;
	} 
	/**
	 * 手机号 
	 */
	public void setPhone (String phone) {
		this.phone = phone;
	} 
	/**
	 * 邮箱 
	 */
	public void setEmail (String email) {
		this.email = email;
	} 
	/**
	 * 联系地址 
	 */
	public void setAddress (String address) {
		this.address = address;
	} 
	/**
	 * 爱好 
	 */
	public void setLover (String[] lover) {
		this.lover = lover;
	} 

    /**
	 * 姓名 
	 */
	public String getName() {
		return this.name;
	}
	/**
	 * 性别 
	 */
	public String getGender() {
		return this.gender;
	}
	/**
	 * 年龄 
	 */
	public int getAge() {
		return this.age;
	}
	/**
	 * 生日 
	 */
	public Date getBirthday() {
		return this.birthday;
	}
	/**
	 * 手机号 
	 */
	public String getPhone() {
		return this.phone;
	}
	/**
	 * 邮箱 
	 */
	public String getEmail() {
		return this.email;
	}
	/**
	 * 联系地址 
	 */
	public String getAddress() {
		return this.address;
	}
	/**
	 * 爱好 
	 */
	public String[] getLover() {
		return this.lover;
	}

}

