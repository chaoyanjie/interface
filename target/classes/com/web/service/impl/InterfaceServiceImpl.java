package com.web.service.impl;



import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.model.common.dao.BaseDao;
import com.model.common.service.impl.BaseServiceImpl;
import com.web.dao.InterfaceDao;
import com.web.entity.InterfaceEntity;
import com.web.service.InterfaceService;



@Service
public class InterfaceServiceImpl extends BaseServiceImpl implements

		InterfaceService {

	@Resource

	InterfaceDao interfaceDao;
public List<InterfaceEntity> getAllByProId(Integer pid){
	return interfaceDao.getAllByProjectId(pid);
}


	@Override

	public BaseDao getDao() {

		// TODO Auto-generated method stub

		return this.interfaceDao;

	}

}