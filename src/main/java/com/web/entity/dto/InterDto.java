package com.web.entity.dto;

import java.util.ArrayList;
import java.util.List;

import com.web.entity.InterfaceEntity;
import com.web.entity.ParameterEntity;

public class InterDto {
private InterfaceEntity iEntity;
private List<ParameterEntity> iList=new ArrayList<ParameterEntity>();

public void addParam(ParameterEntity entity){
	entity.setInterId(this.iEntity.getId());
	this.iList.add(entity);
}
public InterfaceEntity getiEntity() {
	return iEntity;
}
public void setiEntity(InterfaceEntity iEntity) {
	this.iEntity = iEntity;
}
public List<ParameterEntity> getiList() {
	return iList;
}
public void setiList(List<ParameterEntity> iList) {
	this.iList = iList;
}
  

}
