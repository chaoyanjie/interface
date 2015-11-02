package com.web.entity;

import com.model.common.entity.BaseEntity;

public class InterfaceEntity extends BaseEntity{
private Integer proId;
public Integer getProId() {
	return proId;
}
public void setProId(Integer proId) {
	this.proId = proId;
}
public String getIname() {
	return iname;
}
public void setIname(String iname) {
	this.iname = iname;
}
public String getIcode() {
	return icode;
}
public void setIcode(String icode) {
	this.icode = icode;
}
public String getIdetail() {
	return idetail;
}
public void setIdetail(String idetail) {
	this.idetail = idetail;
}
public Integer gethInterId() {
	return hInterId;
}
public void sethInterId(Integer hInterId) {
	this.hInterId = hInterId;
}
private String iname;
private String icode;
private String idetail;
private Integer hInterId;
}
