package test;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import pojo.TestCase;

public class tes {

	public static void main(String args[]) {
		Set<Object> set= new HashSet<Object>();
		List<TestCase> lis= new LinkedList<TestCase>();

		Map<String, Object> map = new HashMap<String, Object>();
		System.out.println(" hi");
		
	
	String str = "1234433222";
	
	set.add("aa");
	set.add("bb");
	set.add("cc");
	
	//map.
	
	char a[] = str.toCharArray();
	
	for(int i =0; i<a.length; i ++) {
		//set.add(a[i]);
	}
		

	System.out.println(set.toString());	
	}
}
