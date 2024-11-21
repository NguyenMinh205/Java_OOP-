package bai3;

import java.io.Serializable;

public class Student implements Serializable {
	protected String sCode;
	protected String name;
	protected String dob;
	protected char gender;

	public Student() {

	}

	public Student(String sCode, String name, String dob, char gender) {
		this.sCode = sCode;
		this.name = name;
		this.dob = dob;
		this.gender = gender;
	}

	public String getsCode() {
		return sCode;
	}

	public void setsCode(String sCode) {
		this.sCode = sCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public String toString() {
		return "Ma sinh vien: " + this.sCode + "\nTen sinh vien: " + this.name + "\nNgay sinh: " + this.dob
				+ "\nGioi tinh: " + this.gender;
	}
}
