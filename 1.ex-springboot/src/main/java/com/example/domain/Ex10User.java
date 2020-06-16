package com.example.domain;

import java.sql.Date;
import java.time.LocalDate;


public class Ex10User {
	private String name;
	private LocalDate birthDay;
	private String comment;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public LocalDate getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay.toLocalDate();
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override
	public String toString() {
		return "Ex10User [name=" + name + ", age=" + birthDay + ", comment=" + comment + "]";
	}

}
