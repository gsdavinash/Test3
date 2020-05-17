package com.read;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

import org.yaml.snakeyaml.Yaml;

import com.model.Family;
import com.model.MainClass;

public class Raedyml {

	public static void main(String[] args) throws FileNotFoundException,IOException {
		// TODO Auto-generated method stub

		Yaml y=new Yaml();
		String s="name: gsdavinashstring";
		Map<String,String> map=y.load(s);
		System.out.println(map.get("name"));
		
		Yaml y2=new Yaml();		
		Map<String,String> map2=y2.load(new FileInputStream("src/main/resources/avinash1.yml"));
		System.out.println(map2);
		
		Yaml y3=new Yaml();
		MainClass c=y3.loadAs(new FileInputStream("src/main/resources/avinashfile2.yaml"),MainClass.class);
		System.out.println(c);
		
		Family f=new Family();
		f.setFather("GNS");
		f.setMother("SOON");
		y3.dump(f,new FileWriter("src/main/resources/avinashfile2.yaml",true));
		System.out.println("dumped");
		
	}

}
