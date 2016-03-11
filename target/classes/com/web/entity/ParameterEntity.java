package com.web.entity;

import com.model.common.entity.BaseEntity;

public class ParameterEntity extends BaseEntity{
	
public ParameterEntity(String paName, String paCode, String paValue) {
		super();
		this.paName = paName;
		this.paCode = paCode;
		this.paValue = paValue;
		
	}


public ParameterEntity() {
	super();
}


private Integer interId;
private String paName;
private String paCode;
private String paValue;
private String paType;
public String getPaType() {
	return paType;
}


public void setPaType(String paType) {
	this.paType = paType;
}


public Integer getInterId() {
	return interId;
}
public void setInterId(Integer interId) {
	this.interId = interId;
}
public String getPaName() {
	return paName;
}
public void setPaName(String paName) {
	this.paName = paName;
}
public String getPaCode() {
	return paCode;
}
public void setPaCode(String paCode) {
	this.paCode = paCode;
}
public String getPaValue() {
	return paValue;
}
public void setPaValue(String paValue) {
	this.paValue = paValue;
}

}
