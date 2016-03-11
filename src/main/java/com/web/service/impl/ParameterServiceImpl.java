package com.web.service.impl;



import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.model.common.dao.BaseDao;
import com.model.common.service.impl.BaseServiceImpl;
import com.web.dao.ParameterDao;
import com.web.entity.ParameterEntity;
import com.web.service.ParameterService;



@Service
public class ParameterServiceImpl extends BaseServiceImpl implements

		ParameterService {

	@Resource

	ParameterDao parameterDao;


	public List<ParameterEntity> getAllByInterId(Integer id){
	    return 	parameterDao.getAllByInterId(id);
	}
	@Override

	public BaseDao getDao() {

		// TODO Auto-generated method stub

		return this.parameterDao;

	}

}