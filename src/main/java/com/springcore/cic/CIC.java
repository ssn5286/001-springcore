package com.springcore.cic;

import java.util.List;

public class CIC {
	private int cId;
	private List<String> list;
	private CICD cicd;
	@Override
	public String toString() {
		return "\nObject CIC \n[cId=" + cId + "\n, list=" + list + "\n, cicd=" + cicd + "]";
	}
	public CIC(int cId, List<String> list, CICD cicd) {
		super();
		this.cId = cId;
		this.list = list;
		this.cicd = cicd;
	}
	
	
	

}
