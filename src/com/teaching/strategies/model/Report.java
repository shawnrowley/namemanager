package com.teaching.strategies.model;

import java.io.Serializable;
/**
 * 
 * Report class 
 * 
 * @author srowley
 *
 */
@SuppressWarnings("serial")
public class Report implements Serializable{
	
	private String name;
	private Long instances;
	private String gender;
	private String accuracy;
	private String country;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Long getInstances() {
		return instances;
	}
	public void setInstances(Long instances) {
		this.instances = instances;
	}
	
	public void setInstances(int instances) {
		this.instances = new Long(instances);
	}

	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAccuracy() {
		return accuracy;
	}
	public void setAccuracy(String accuracy) {
		this.accuracy = accuracy;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

}
