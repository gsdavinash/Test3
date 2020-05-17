package com.aditya;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

public class Family {

	private String father;
	private String mother;
	private List<String> kids;
	
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
	public List<String> getKids() {
		return kids;
	}
	public void setKids(List<String> kids) {
		this.kids = kids;
	}
	
	/*
	public static void main(String[] args) throws IOException {
		Properties p  = new Properties();
		FileInputStream obj = new FileInputStream("src/main/resources/familyop.properties");
		p.load(obj);
		
		System.out.println(p.getProperty("kids"));
		String s[] = p.getProperty("kids").split(",");
		List<String> l = Arrays.asList(s);
		System.out.println(l);
		*/
	
	
	
	
}
