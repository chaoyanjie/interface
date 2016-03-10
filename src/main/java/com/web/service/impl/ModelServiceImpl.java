package com.web.service.impl;



import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.model.common.dao.BaseDao;
import com.model.common.service.impl.BaseServiceImpl;
import com.web.dao.ModelDao;
import com.web.entity.ModelEntity;
import com.web.service.ModelService;



@Service
public class ModelServiceImpl extends BaseServiceImpl implements

		ModelService {

	@Resource

	ModelDao modelDao;
public List<ModelEntity> getAllByProId(int pid){
	return modelDao.getAllByProjectId(pid);
			
}


	@Override

	public BaseDao getDao() {

		// TODO Auto-generated method stub

		return this.modelDao;

	}

}