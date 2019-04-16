package com.cts.academy_portal.bean;

import java.io.InputStream;
import java.sql.Blob;
import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity; 
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="Login_Table")
public class Login {
	
	private String userName;
	private String password;
	private String userType;
	private int	userStatus;
	private String fName;
	private String lName;
   // private Byte[] profile_photo;

	
	
	@Id
	@Column(name="userName")
	public String getUserName() {
		return userName;
	}
	
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public int getUserStatus() {
		return userStatus;
	}
	public void setUserStatus(int userStatus) {
		this.userStatus = userStatus;
	}
	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		return super.equals(arg0);
	}
	
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}

	
	
	
	
	public Login()
	{}


	/*public Byte[] getProfile_photo() {
		return profile_photo;
	}


	public void setProfile_photo(Byte[] profile_photo) {
		this.profile_photo = profile_photo;
	}*/


	@Override
	public String toString() {
		return "Login [userName=" + userName + ", password=" + password + ", userType=" + userType + ", userStatus="
				+ userStatus + ", fName=" + fName + ", lName=" + lName + /*", profile_photo="
				+ Arrays.toString(profile_photo) + "]"*/"";
	}


	public Login(String userName, String password, String userType, int userStatus, String fName, String lName) {
		super();
		this.userName = userName;
		this.password = password;
		this.userType = userType;
		this.userStatus = userStatus;
		this.fName = fName;
		this.lName = lName;
		/*this.profile_photo = profile_photo;*/
	}

}
