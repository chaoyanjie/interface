package com.web.entity;

import com.model.common.entity.BaseEntity;

public class ProjectEntity extends BaseEntity{
private String pname;
private String pversion;
private String pdetail;

public ProjectEntity() {
	super();
}
public ProjectEntity(String pname, String pversion, String pdetail) {
	super();
	this.pname = pname;
	this.pversion = pversion;
	this.pdetail = pdetail;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public String getPversion() {
	return pversion;
}
public void setPversion(String pversion) {
	this.pversion = pversion;
}
public String getPdetail() {
	return pdetail;
}
public void setPdetail(String pdetail) {
	this.pdetail = pdetail;
}
}
