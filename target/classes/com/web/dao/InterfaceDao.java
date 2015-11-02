package com.web.dao;

import java.util.List;

import com.model.common.dao.BaseDao;
import com.web.entity.InterfaceEntity;

public interface InterfaceDao extends BaseDao<InterfaceEntity>{ 
	
	public List<InterfaceEntity> getAllByProjectId(Integer pid);

}