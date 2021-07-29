package com.xworkz.rogidetails.dto;

import java.io.Serializable;

public class RogiDTO implements Serializable {
	
	private int id;
	private String name;
	private int age;
	private String kayile;
	private boolean badukugurantee;
	public RogiDTO() {
		
	}
	public RogiDTO(int id, String name, int age, String kayile, boolean badukugurantee) {
		
		this.id = id;
		this.name = name;
		this.age = age;
		this.kayile = kayile;
		this.badukugurantee = badukugurantee;
	}
	@Override
	public String toString() {
		return "rogiDTO [id=" + id + ", name=" + name + ", age=" + age + ", kayile=" + kayile + ", badukugurantee="
				+ badukugurantee + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (badukugurantee ? 1231 : 1237);
		result = prime * result + ((kayile == null) ? 0 : kayile.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		rogiDTO other = (rogiDTO) obj;
		if (badukugurantee != other.badukugurantee)
			return false;
		if (kayile == null) {
			if (other.kayile != null)
				return false;
		} else if (!kayile.equals(other.kayile))
			return false;
		return true;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getKayile() {
		return kayile;
	}
	public void setKayile(String kayile) {
		this.kayile = kayile;
	}
	public boolean isBadukugurantee() {
		return badukugurantee;
	}
	public void setBadukugurantee(boolean badukugurantee) {
		this.badukugurantee = badukugurantee;
	}
	
	

}
