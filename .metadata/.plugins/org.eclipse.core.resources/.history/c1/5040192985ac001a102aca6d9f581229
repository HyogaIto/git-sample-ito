package com.example.form;

import java.util.List;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


public class Ex17QuestionnaireForm {
	@NotBlank(message = "名前は必須です")
	private String name;
	@Email(message = "Eメールの形式が不正です")
	@Size(min=1,max=127,message="1文字以上127文字以下で入力してください")
	private String email;
	@NotNull(message = "選択してください")
	private String gender;
	@NotEmpty(message = "趣味は1つ以上選択してください")
	private List<Integer> hobbyList;
	private String program;
	private String comment;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public List<Integer> getHobbyList() {
		return hobbyList;
	}

	public void setHobbyList(List<Integer> hobbylist) {
//		System.out.println(hobbylist);
		this.hobbyList = hobbylist;
	}

	public String getProgram() {
		return program;
	}

	public void setProgram(String program) {
		this.program = program;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override
	public String toString() {
		return "Questionnaire [name=" + name + ", email=" + email + ", gender=" + gender + ", hobbylist=" + hobbyList
				+ ", program=" + program + ", comment=" + comment + "]";
	}


}
