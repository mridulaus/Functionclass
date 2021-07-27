package com.xworkz.functioninterface.dto;

import java.io.Serializable;

import com.xworkz.functioninterface.constant.Religion;

public class FestivalDTO  implements Serializable{
	private String name;
	private String region;
	private int noOfDays;
	private Religion religion;
	private String spclFood;
	public FestivalDTO(String name, String region, int noOfDays, Religion religion, String spclFood) {
		
		this.name = name;
		this.region = region;
		this.noOfDays = noOfDays;
		this.religion = religion;
		this.spclFood = spclFood;
	}
	public FestivalDTO() {
		
	}
	@Override
	public String toString() {
		return "FestivalDTO [name=" + name + ", region=" + region + ", noOfDays=" + noOfDays + ", religion=" + religion
				+ ", spclFood=" + spclFood + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + noOfDays;
		result = prime * result + ((religion == null) ? 0 : religion.hashCode());
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
		FestivalDTO other = (FestivalDTO) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (noOfDays != other.noOfDays)
			return false;
		if (religion != other.religion)
			return false;
		return true;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public int getNoOfDays() {
		return noOfDays;
	}
	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}
	public Religion getReligion() {
		return religion;
	}
	public void setReligion(Religion religion) {
		this.religion = religion;
	}
	public String getSpclFood() {
		return spclFood;
	}
	public void setSpclFood(String spclFood) {
		this.spclFood = spclFood;
	}
	
	

}
