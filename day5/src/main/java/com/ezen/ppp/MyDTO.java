package com.ezen.ppp;

public class MyDTO {
	String id,name,tell,address;

	public MyDTO() {}

	public MyDTO(String id, String name, String tell, String address) {
		super();
		this.id = id;
		this.name = name;
		this.tell = tell;
		this.address = address;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTell() {
		return tell;
	}

	public void setTell(String tell) {
		this.tell = tell;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	

}
