package com.model;

import java.util.List;

public class MainClass {
	
	List<Family> family;

	public List<Family> getFamily() {
		return family;
	}

	public void setFamily(List<Family> family) {
		this.family = family;
	}

	@Override
	public String toString() {
		return "MainClass [family=" + family + "]";
	}
	
	

}
