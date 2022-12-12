package com.Examples.com.Examples.Basic;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Learners {
	private String name;
	@Id
	private int rollnumber;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollnumber() {
		return rollnumber;
	}
	public void setRollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
	}

}
