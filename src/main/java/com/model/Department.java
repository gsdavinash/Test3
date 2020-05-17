package com.model;

import java.util.List;
import java.util.Map;

public class Department {

	private int deptId;
	
	private String deptName;
	
	private List<String> faculty;
	
	private Map<Integer,String> subject;

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public List<String> getFaculty() {
		return faculty;
	}

	public void setFaculty(List<String> faculty) {
		this.faculty = faculty;
	}

	public Map<Integer, String> getSubject() {
		return subject;
	}

	public void setSubject(Map<Integer, String> subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + ", faculty=" + faculty + ", subject="
				+ subject + "]";
	}
	
	
	
	
}
