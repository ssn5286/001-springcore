package com.springcore.cic;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CICD {
	private Set<String> set;
	private Map<String,String> map;
	private Properties properties;
	public CICD(Set<String> set, Map<String, String> map, Properties properties) {
		super();
		this.set = set;
		this.map = map;
		this.properties = properties;
	}
	@Override
	public String toString() {
		return "\nCICD [set=" + set + ", \nmap=" + map + ", \nproperties=" + properties + "]";
	}

}
