package com.web.dao;

import java.util.List;

import com.model.common.dao.BaseDao;
import com.web.entity.InterfaceEntity;
import com.web.entity.ParameterEntity;

public interface ParameterDao extends BaseDao<ParameterEntity>{ 
	public List<ParameterEntity> getAllByInterId(Integer iid);
}