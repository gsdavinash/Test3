package com.model;

public class Family {
	
	private String father;
	
	private String mother;

	public String getFather() {
		return father;
	}

	public void setFather(String father) {
		this.father = father;
	}

	public String getMother() {
		return mother;
	}

	public void setMother(String mother) {
		this.mother = mother;
	}

	@Override
	public String toString() {
		return "Family [father=" + father + ", mother=" + mother + "]";
	}
	
	

}
