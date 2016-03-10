package com.web.entity;

import com.model.common.entity.BaseEntity;

public class ModelEntity   extends BaseEntity {
private String modelName;
private String modelDetail;
private String interIds;
public String getInterIds() {
	return interIds;
}
public void setInterIds(String interIds) {
	this.interIds = interIds;
}
private Integer proId;
public Integer getProId() {
	return proId;
}
public void setProId(Integer proId) {
	this.proId = proId;
}
public String getModelName() {
	return modelName;
}
public void setModelName(String modelName) {
	this.modelName = modelName;
}
public String getModelDetail() {
	return modelDetail;
}
public void setModelDetail(String modelDetail) {
	this.modelDetail = modelDetail;
}

}
