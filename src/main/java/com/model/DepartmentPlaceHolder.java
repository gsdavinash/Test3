package com.model;

public class DepartmentPlaceHolder {
	
	
	private Department department;
	
	private int count;

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "DepartmentPlaceHolder [department=" + department + ", count=" + count + "]";
	}
	
	
	

}
