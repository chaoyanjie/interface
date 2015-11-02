package com.web.service.impl;



import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.model.common.dao.BaseDao;
import com.model.common.service.impl.BaseServiceImpl;
import com.web.dao.InterfaceDao;
import com.web.service.InterfaceService;



@Service
public class InterfaceServiceImpl extends BaseServiceImpl implements

		InterfaceService {

	@Resource

	InterfaceDao interfaceDao;



	@Override

	public BaseDao getDao() {

		// TODO Auto-generated method stub

		return this.interfaceDao;

	}

}