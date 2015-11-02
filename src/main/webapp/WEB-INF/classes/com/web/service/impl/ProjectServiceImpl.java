package com.web.service.impl;



import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.model.common.dao.BaseDao;
import com.model.common.service.impl.BaseServiceImpl;
import com.web.dao.ProjectDao;
import com.web.service.ProjectService;



@Service
public class ProjectServiceImpl extends BaseServiceImpl implements

		ProjectService {

	@Resource

	ProjectDao projectDao;



	@Override

	public BaseDao getDao() {

		// TODO Auto-generated method stub

		return this.projectDao;

	}

}