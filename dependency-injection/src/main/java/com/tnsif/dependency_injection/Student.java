package com.tnsif.dependency_injection;

public class Student {
	int sid;
	String sname;
	String city;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public void showInfo()
	{
		System.out.println("Id:"+sid+" Name:"+sname+" City:"+city);
	}
}