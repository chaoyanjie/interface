package com.web.entity;

import com.model.common.entity.BaseEntity;

public class ParameterEntity extends BaseEntity{
private Integer interId;
private String paName;
private String paCode;
private String paValue;
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
