package com.ssd.delivery.domain;

import java.io.Serializable;

public class AccountDTO implements Serializable{
	private String username;
	private String password;
	private String email;
	private String firstName;
	private String lastName;
	private String address;
	private String phone;
	private String languagePreference;
	private int status;
	private String favoriteUser;
	private String carInfo;
	
	//기본생성자
	public AccountDTO() {
		super();
	}
	
	//Register 생성자
	public AccountDTO(String username, String password, String email, String firstName, String lastName,
			String address, String phone, String languagePreference, int status, String favoriteMall, String carInfo) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.phone = phone;
		this.languagePreference = languagePreference;
		this.status = status;
		this.favoriteUser = favoriteMall;
		this.carInfo = carInfo;
	}
	
	//update 생성자
	public AccountDTO(String email, String firstName, String lastName, String address, String phone,
			String languagePreference, int status, String favoriteMall, String carInfo) {
		super();
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.phone = phone;
		this.languagePreference = languagePreference;
		this.status = status;
		this.favoriteUser = favoriteMall;
		this.carInfo = carInfo;
	}
	
	//비밀번호 확인 메소드
	public boolean matchPassword(String password) {
		System.out.println(password);
		if (password == null) {
			return false;
		}
		return this.password.equals(password);
	}

	//사용자 관리자 구분 메소드
	public boolean isManager() {
		//		System.out.println(this.user_level);
		if (this.status < 2) {
			return false;
		}
		return true;
	}
	
	//사용자 중복 확인
	public boolean isSameUser(String userid) {
		return this.username.equals(userid);
	}

	//setter & getter
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getLanguagePreference() {
		return languagePreference;
	}
	public void setLanguagePreference(String languagePreference) {
		this.languagePreference = languagePreference;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getFavoriteUser() {
		return favoriteUser;
	}
	public void setFavoriteUser(String favoriteUser) {
		this.favoriteUser = favoriteUser;
	}
	public String getCarInfo() {
		return carInfo;
	}
	public void setCarInfo(String carInfo) {
		this.carInfo = carInfo;
	}
	
}
