package com.example.form;

import java.sql.Date;

public class Ex10Form {
	private String name;
	private Date birthDay;
	private String comment;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	public Date getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override
	public String toString() {
		return "Ex10Form [name=" + name + ", age=" + birthDay + ", comment=" + comment + "]";
	}

}
