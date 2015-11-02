package com.web.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.model.common.dao.BaseDao;
import com.model.common.service.impl.BaseServiceImpl;
import com.web.dao.InterfaceDao;
import com.web.dao.ParameterDao;
import com.web.dao.ProjectDao;
import com.web.entity.InterfaceEntity;
import com.web.entity.ProjectEntity;
import com.web.entity.dto.InterDto;
import com.web.entity.dto.ProjectDto;
import com.web.service.ProjectService;

@Service
public class ProjectServiceImpl extends BaseServiceImpl implements ProjectService {
	
	
	public ProjectDto getProjectDetail(Integer pid){
		ProjectDto pdto=new ProjectDto();
		ProjectEntity entity=projectDao.getObjectById(pid);
		pdto.setProEntity(entity);
		List<InterfaceEntity> ilist =interfaceDao.getAllByProjectId(pid);
		for(int i=0;i<ilist.size();i++){
			InterDto temp=new InterDto();
			temp.setiEntity(ilist.get(i));
			temp.setiList(parameterDao.getAllByInterId(ilist.get(i).getId()));
			pdto.addInter(temp);
		}
		return pdto;
	}
	@Resource
	ParameterDao parameterDao;
	@Resource
InterfaceDao interfaceDao;
	@Resource
	ProjectDao projectDao;

	@Override
	public BaseDao getDao() {

		// TODO Auto-generated method stub

		return this.projectDao;

	}

}