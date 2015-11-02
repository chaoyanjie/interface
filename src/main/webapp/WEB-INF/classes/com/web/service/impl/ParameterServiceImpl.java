package com.web.service.impl;



import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.model.common.dao.BaseDao;
import com.model.common.service.impl.BaseServiceImpl;
import com.web.dao.ParameterDao;
import com.web.service.ParameterService;



@Service
public class ParameterServiceImpl extends BaseServiceImpl implements

		ParameterService {

	@Resource

	ParameterDao parameterDao;



	@Override

	public BaseDao getDao() {

		// TODO Auto-generated method stub

		return this.parameterDao;

	}

}