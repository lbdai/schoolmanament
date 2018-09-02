package com.management.school.utils;

import java.io.Serializable;

public class KeyValue implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5611945523758138935L;
	private String key;
	private String value;
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
	
}
