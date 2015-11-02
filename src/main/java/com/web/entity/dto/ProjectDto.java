package com.web.entity.dto;

import java.util.ArrayList;
import java.util.List;

import com.web.dao.InterfaceDao;
import com.web.entity.InterfaceEntity;
import com.web.entity.ProjectEntity;

public class ProjectDto {
private ProjectEntity proEntity;
private List<InterDto> iList=new ArrayList<InterDto>();

public void addInter(InterDto entity){
	entity.getiEntity().setProId(this.proEntity.getId());
	this.iList.add(entity);
}

public ProjectEntity getProEntity() {
	return proEntity;
}
public void setProEntity(ProjectEntity proEntity) {
	this.proEntity = proEntity;
}
public List<InterDto> getiList() {
	return iList;
}
public void setiList(List<InterDto> iList) {
	this.iList = iList;
}

}
