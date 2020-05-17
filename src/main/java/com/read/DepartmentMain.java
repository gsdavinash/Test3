package com.read;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.yaml.snakeyaml.Yaml;

import com.model.DepartmentPlaceHolder;

public class DepartmentMain {

	public static void main(String[] args) throws FileNotFoundException,IOException {
		// TODO Auto-generated method stub

		Yaml y=new Yaml();
		DepartmentPlaceHolder dph=y.loadAs(new FileInputStream("src/main/resources/dep.yml"), DepartmentPlaceHolder.class);
		System.out.println(dph);
	}

}
