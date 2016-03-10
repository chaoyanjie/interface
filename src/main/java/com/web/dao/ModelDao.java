package com.web.dao;

import java.util.List;

import com.model.common.dao.BaseDao;
import com.web.entity.InterfaceEntity;
import com.web.entity.ModelEntity;

public interface ModelDao extends BaseDao<ModelEntity>{ 
	public List<ModelEntity> getAllByProjectId(Integer pid);
}